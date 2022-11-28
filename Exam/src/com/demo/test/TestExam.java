package com.demo.test;

import java.util.Date;
import java.util.Scanner;

import com.demo.beans.Exam;
import com.demo.services.ExamServices;

public class TestExam {

	public static void main(String[] args) {
		Exam ob=new Exam();

		int choice=0;
		Scanner sc=new Scanner(System.in);

		do {
			System.out.println("Select the Module:\n1. Java\n2. HTML");
			choice=sc.nextInt();
			switch(choice) {

				default: System.out.println("Invalid Choice!");
					break;
				case 1: 
					Exam javaExam=new Exam(100,"javaaaa","basic",new Date(12-12-2022),ExamServices.getarray(choice));
					ExamServices.java_test(javaExam.getQuelist());
					break;
				
				case 2:
					Exam htmlExam=new Exam(101,"htmlll","basic",new Date(15-03-2022),ExamServices.getarray(choice));
					ExamServices.html_test(htmlExam.getQuelist());
					break;
				
//				case 3: System.out.println("Thank You!");
//				break;
			}
			
			System.out.println("Do you want to continue: \n1.yes \n2.No");
			int no=sc.nextInt();
			
			if(no==2)			
			{
				System.exit(0);
			}
		}while(choice!=3);
	}

}
