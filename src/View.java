
import javax.swing.*;
public class View {
    
    static JFrame f=new JFrame();
    JLabel q = new JLabel();
    static int i =25;
    static int k=0;
  
    View(){
        f.setLayout(null);
    }
    
    public void set(){
        i=25;
        k=0;
        f.getContentPane().removeAll();
        f.revalidate();
        f.repaint();
    }
    public void addQ(String ques ){
        q.setVisible(true);
        q.setText(ques);
        q.setBounds(30,i,500,50);
        f.add(q);
        i+=25;
        k+=25;
    }
    
    public void addChoice(String choice){
        q.setVisible(true);
        q.setText(choice);
        q.setBounds(500,k,200,50);
        f.add(q);
        i+=25;
        k+=25;
    }
    
    public void Evaluate(String eval){
        q.setVisible(true);
        q.setText(eval);
        q.setBounds( 700,k,200,50);
        f.add(q);
    }
    
    public void CorrectView(String correct){
        q.setVisible(true);
        q.setText(correct);
        q.setBounds( 1000,k,200,50);
        f.add(q);
    }
    public void setView(){
        f.setSize(1000,5000);
        f.setVisible(true);
    }

    }

