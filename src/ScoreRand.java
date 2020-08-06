
import java.awt.HeadlessException;
import java.sql.*;
import java.util.*;

public class ScoreRand {
   
    private static int score[]=new int[10];
    private static int randQ[]=new int[10];
    
    int quesno=getQuesNum();
   
    
    public void createScore(){
        for(int i =0;i<quesno;i++)
            score[i]=0;
    }
    
    public int getQuesNum(){
        Connection conn=null;
        Statement Stat=null;
        ResultSet rs=null;
        int count=0;
        try{
            //Question table
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","newrootpassword");
            Stat=conn.createStatement();
            rs = Stat.executeQuery("select * from onlineexam.mcq");
            while(rs.next())
            {
                count++;
            }
        }
        catch(SQLException | HeadlessException e){
            System.out.println("Error"+e);
        }    
        finally {
            try { rs.close(); } catch (Exception e) { /* ignored */ }
            try { Stat.close(); } catch (Exception e) { /* ignored */ }
            try { conn.close(); } catch (Exception e) { /* ignored */ }
        }
        return count;
    }
    
    public void createRand(){
        Integer[] a=new Integer[quesno];
        for(int i=0;i<quesno;i++)
            a[i]=i+1;
        List<Integer> list=Arrays.asList(a);
        Collections.shuffle(list);
        for(int i=0;i<list.size();i++)
            randQ[i]=list.get(i);
        
        
    }
    
    public void insertAllQuery(){
        Connection myConn=null;
        PreparedStatement pst=null,pst2=null;
        
       try{
            myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","newrootpassword");
            pst = myConn.prepareStatement("update onlineexam.scorerand set random=? ,score=? where serialnum=?");
            pst2=myConn.prepareStatement("update onlineexam.viewtable set randomnum=? where serialnum=?");
            for(int i=0;i<5;i++){
                pst.setInt(1,randQ[i]);
                pst.setInt(2,score[i]);
                pst.setInt(3,i+1);
                pst.executeUpdate();
                pst2.setInt(1, randQ[i]);
                pst2.setInt(2,i+1);
                pst2.executeUpdate();
            }   
            
        }
        catch(SQLException | HeadlessException e){
            e.printStackTrace();
            System.out.println("Error");
        } 
       finally{
            try { pst.close(); } catch (Exception e) { /* ignored */ }
            try { pst2.close(); } catch (Exception e) { /* ignored */ }
            try { myConn.close(); } catch (Exception e) { /* ignored */ }
       }
    }
    
    
    public int[] getQues(){
        return randQ;
    }
    
    public void reset(){
        for(int i=0;i<quesno;i++){
            score[i]=0;
            randQ[i]=0;
        }
    }
    
   
}