package com.demo.services;

import java.util.Date;
import java.util.Scanner;

import com.demo.beans.Exam;
import com.demo.beans.Question;

public class ExamServices {
	
	private static Question []java=new Question[5];
	private static Question []html=new Question[5];
	private static int totalMarks;
//	private static Exam javaExam,htmlExam;
	
	static
	{
		java[0]=new Question(1,"Which of the following is not a Java features?","Dynamic", "Architecture Neutral", "Use of pointers","Object-oriented",3,1);
		java[1]=new Question(2,"Which of the following is not an OOPS concept in Java?","Polymorphism", "Inheritance", "Compilation","Encapsulation",3,1);
		java[2]=new Question(3,"What is the extension of compiled java classes?",".txt", ".js", ".class",".java",3,1);
		java[3]=new Question(4,"Which of these are selection statements in Java?","break", "continue", "for()","if()",4,1);
		java[4]=new Question(5,"Which one of the following is not an access modifier?","Protected", "Void", "Public","Private",2,1);

		html[0]=new Question(1,"In which part of the HTML metadata is contained?","head tag", "title tag", "html tag","body tag",1,1);
		html[1]=new Question(2,"Which element is used to get highlighted text in HTML5?","<u>", "<mark>", "<highlight>","<b>",2,1);
		html[2]=new Question(3,"How do we write comments in HTML?","</…….>", " <!……>", "</……/>"," <…….!>",2,1);
		html[3]=new Question(4,"Which element is used for or styling HTML5 layout?","CSS", "jQuery", "JavaScript","PHP",1,1);
		html[4]=new Question(5," HTML is a subset of ___________","SGMT", "SGML", "SGME","XHTML",2,1);
		
//		javaExam=new Exam(100,"javaaaa","basic",new Date(12-12-2022),java);
//		htmlExam=new Exam(101,"htmlll","basic",new Date(15-03-2022),html);
	}
	
	public static Question[] getarray(int choice)
	{
		if(choice ==1) {
			return java;
		}
		else
		{
			return html;
		}
	}
	{
		
	}
   public static void java_test(Question java[])
   {
	   Scanner sc=new Scanner(System.in);
	   
	   totalMarks=0;

	   for(int i=0;i<java.length;i++) 
	   {
		   System.out.println(java[i]);
		   System.out.println("enter your choice");
		   int choice=sc.nextInt();

		   if(choice==java[i].getAns())
		   {
			   totalMarks++;
		   }  
	   }	
	   display(totalMarks);
   }
   public static void html_test(Question html[])
   {
	   Scanner sc=new Scanner(System.in);
	   
	   totalMarks=0;

	   for(int i=0;i<java.length;i++) 
	   {
		   System.out.println(html[i]);
		   System.out.println("enter your choice");
		   int choice=sc.nextInt();

		   if(choice==html[i].getAns())
		   {
			   totalMarks++;
		   }  
	   }	
	   display(totalMarks);
   
   }  
	public static void display(int marks) {
		
		if(marks >=3)
		{
			System.out.println("congratulations you completed the test");
		}
		else
		{
			System.out.println("better luck next time");
		}
		
	}
	
}