package com.demo.beans;



import java.util.Arrays;
import java.util.Date;

public class Exam {
	private int examid;
	private String name;
	private String topic;
	private Date exam_date;
	private Question [] Quelist;
	
	
	public Exam() {
		
		this.examid = 0;
		this.name = null;
		this.topic = null;
		this.exam_date = null;
		this.Quelist = null;
	}


	public Exam(int examid, String name, String topic, Date exam_date, Question[] Quelist) {
		super();
		this.examid = examid;
		this.name = name;
		this.topic = topic;
		this.exam_date = exam_date;
		this.Quelist = Quelist;
		
	}


	public int getExamid() {
		return examid;
	}


	public void setExamid(int examid) {
		this.examid = examid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}


	public Date getExam_date() {
		return exam_date;
	}


	public void setExam_date(Date exam_date) {
		this.exam_date = exam_date;
	}


	public Question[] getQuelist() {
		return Quelist;
	}


	public void setQuelist(Question[] quelist) {
		Quelist = quelist;
	}


	@Override
	public String toString() {
		return "Exam [examid=" + examid + ", name=" + name + ", topic=" + topic + ", exam_date=" + exam_date
				+ ", Quelist=" + Arrays.toString(Quelist) + "]";
	}
	
	
	
}
