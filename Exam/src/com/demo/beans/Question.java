package com.demo.beans;

public class Question {
	 
	private int Qno;
	private String question;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private int ans;
	private int mark;
	
	
	public Question() {
		Qno = 0;
		this.question = null;
		this.opt1 =  null;
		this.opt2 =  null;
		this.opt3 =  null;
		this.opt4 =  null;
		this.ans = 0;
		this.mark = 0;
	}


	public Question(int qno, String question, String opt1, String opt2, String opt3, String opt4, int ans, int marks) {
		Qno = qno;
		this.question = question;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
		this.mark = marks;
	}


	public int getQno() {
		return Qno;
	}


	public void setQno(int qno) {
		Qno = qno;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getOpt1() {
		return opt1;
	}


	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}


	public String getOpt2() {
		return opt2;
	}


	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}


	public String getOpt3() {
		return opt3;
	}


	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}


	public String getOpt4() {
		return opt4;
	}


	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}


	public int getAns() {
		return ans;
	}


	public void setAns(int ans) {
		this.ans = ans;
	}


	public int getMarks() {
		return mark;
	}


	public void setMarks(int marks) {
		this.mark = marks;
	}


	@Override
	public String toString() {
		return " Qno=" + Qno + "=" + question + "\n opt1=" + opt1 + "\n opt2=" + opt2 + "\n opt3="
				+ opt3 + "\n opt4=" + opt4;
	}
	
	
		
}
