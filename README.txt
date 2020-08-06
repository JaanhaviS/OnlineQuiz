
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
									ONLINE EXAMINATION PORTAL
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

>> This project aims to help students to attend tests online and helps lessen the burden on professors.
>> It is a quiz simulation where the student can login and attend the test.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Features of this Project are:
	>> Two modules Professor and Student
		PROFESSOR:
			>> View the scores of the students who attended the test
			>> Add a new Question into the database
		STUDENT:
			>> Login ID and Password set by the professor for all students and is available in the database
			>> The quiz is timed. Thus after 60 sec , the quiz ends and you would be directed to the performance sheet
			>> Random questions are generated for each login
			>> The student can revisit the question and change the answer before the time ends
			>> After quiz ends , the student will be able to view their marks and a performance table
			>> The perfomance table contains 
				>> The question they attended
				>> The correct answer for that question
				>> The answer they marked for that question
				>> The score they got for that question


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

SOFTWARES REQUIRED:
	>> MySQL Server 8.0
	>> Java jdk 1.8
	>> NetBeans 8.0.1
	>> mysql-connector-java-8.0.17.jar
	>> rs2xml.jar

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
MySQL 
	>>used as a database for storing necassary informations 
		
	>> for connecting MySQL 
		>> Username 	: root
		>> Password  	: newrootpassword
		>> localhost	: 3306

	>>Create a scheme "onlineexam"
		>> Open this path C:\ProgramData\MySQL\MySQL Server 8.0\Data\onlineexam
		>> Copy these tables available in the "database" folder that are gonna provide useful for the running of the software
			1. studentlogin 
				>>username
				>>password
				>>score (initially at -1)
			2.professorlogin
				>>username
				>>password
			3.mcq
				>>questionno
				>>question
				>>option1
				>>option2
				>>option3
				>>option4
				>>ans
			4.scorerand  (contains information about the particular students random number for each serialnumber and the score)
				>>serialnum
				>>randomnum
				>>score
			5.viewtable  (the performance of the student will be updated in this database)
				>>serialnum
				>>randomnum
				>>Question
				>>marked_answer
				>>score
				>>correct_answer

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
========================
BUILD OUTPUT DESCRIPTION
========================

	>> When you build an Java application project that has a main class, the IDE
	automatically copies all of the JAR
	files on the projects classpath to your projects dist/lib folder. The IDE
	also adds each of the JAR files to the Class-Path element in the application
	JAR files manifest file (MANIFEST.MF).

	>> To run the project from the command line, go to the "jar file" folder and
	type the following:

		java -jar "OnlineExam.jar" 

	>>To distribute this project, zip up the dist folder (including the lib folder)
	and distribute the ZIP file.

	>>Notes:

		>> If two JAR files on the project classpath have the same name, only the first
		JAR file is copied to the lib folder.
		>> Only JAR files are copied to the lib folder.
		If the classpath contains other types of files or folders, these files (folders)
		are not copied.
		>> If a library on the projects classpath also has a Class-Path element
		specified in the manifest,the content of the Class-Path element has to be on
		the projects runtime path.
		>> To set a main class in a standard Java project, right-click the project node
		in the Projects window and choose Properties. Then click Run and enter the
		class name in the Main Class field. Alternatively, you can manually type the
		class name in the manifest Main-Class element.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

I am unable to upload the zip files as the size exceeds the maximum specified size. i have attched the neccasary in the email

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
									Thank You
									      By
								             Jaanhavi S
								          GouthamNath P 
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


				



























