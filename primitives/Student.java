package com.springcore.primitives;

/**
 * Hello world!
 *
 */
public class Student 
{
	private int studentId;
	private String studentName;
	private String stdAddress;
	
	public int getStudentId() {
		//System.out.println("Inside get Method of Student Id"+studentId);
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
		System.out.println("Inside set Method of Student Id "+this.studentId);
	}
	public String getStudentName() {
		///System.out.println("Inside get Method of StudentName"+studentName);
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Inside set Method of StudentName "+this.studentName);
	}
	public String getStdAddress() {
		//System.out.println("Inside get Method of StudentAddress"+stdAddress);
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
		System.out.println("Inside set Method of StudentAddress "+stdAddress);
	}
	public Student() {
		super();
		System.out.println("Default Constructor");
		
	}
    
	public Student(int studentId, String studentName, String stdAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.stdAddress = stdAddress;
		System.out.println("Parameterized Constructor");
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", stdAddress=" + stdAddress + "]";
	}
	
}
