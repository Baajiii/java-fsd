package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SubjectDetails")
public class SubjectDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int Id;
	@Column(name="Subject_Name")
	private String SubjectName;
	@Column(name="Subject_Code")
	private String SubjectCode;
	@Column(name="Subject_Teacher")
	private String SubjectTeacher;
	@Column(name="Class_No")
	private String ClassNo;
	
	public SubjectDetails() {}
	
	public SubjectDetails(String subjectName, String subjectCode, String subjectTeacher, String ClassNo) {
		SubjectName = subjectName;
		SubjectCode = subjectCode;
		SubjectTeacher = subjectTeacher;
		this.ClassNo = ClassNo;
	}
	
	public SubjectDetails(int id, String subjectName, String subjectCode, String subjectTeacher, String ClassNo) {
		super();
		Id = id;
		SubjectName = subjectName;
		SubjectCode = subjectCode;
		SubjectTeacher = subjectTeacher;
		this.ClassNo = ClassNo;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public String getSubjectCode() {
		return SubjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		SubjectCode = subjectCode;
	}

	public String getSubjectTeacher() {
		return SubjectTeacher;
	}

	public void setSubjectTeacher(String subjectTeacher) {
		SubjectTeacher = subjectTeacher;
	}
	

	public String getClassNo() {
		return ClassNo;
	}

	public void setClassNo(String classNo) {
		ClassNo = classNo;
	}

	@Override
	public String toString() {
		return "SubjectDetails [Id=" + Id + ", SubjectName=" + SubjectName + ", SubjectCode=" + SubjectCode
				+ ", SubjectTeacher=" + SubjectTeacher + ", ClassNo=" + ClassNo + "]";
	}

}