package com.learning.cruddemo;

public class StudentModel {

	int stdId;
	String stdNm;
	String stdMail;
	
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentModel(int stdId, String stdNm, String stdMail) {
		super();
		this.stdId = stdId;
		this.stdNm = stdNm;
		this.stdMail = stdMail;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdNm() {
		return stdNm;
	}

	public void setStdNm(String stdNm) {
		this.stdNm = stdNm;
	}

	public String getStdMail() {
		return stdMail;
	}

	public void setStdMail(String stdMail) {
		this.stdMail = stdMail;
	}

	@Override
	public String toString() {
		return "StudentModel [stdId=" + stdId + ", stdNm=" + stdNm + ", stdMail=" + stdMail + "]";
	}
	
	
	
}
