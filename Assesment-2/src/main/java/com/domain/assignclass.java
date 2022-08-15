package com.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assignClass")
public class assignclass {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int Id;
	@Column(name="Class")
	private String ClassName;
	@Column(name="Section")
	private String ClassSection;
	@Column(name="Subject_Name")
	private String SubjectName;
	@Column(name="Subject_Teacher")
	private String SubjectTeacher;
	
	
	public assignclass() {
		
	}


	public assignclass( String className, String classSection, String subjectName, String subjectTeacher) {
		super();
		ClassName = className;
		ClassSection = classSection;
		SubjectName = subjectName;
		SubjectTeacher = subjectTeacher;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getClassName() {
		return ClassName;
	}


	public void setClassName(String className) {
		ClassName = className;
	}


	public String getClassSection() {
		return ClassSection;
	}


	public void setClassSection(String classSection) {
		ClassSection = classSection;
	}


	public String getSubjectName() {
		return SubjectName;
	}


	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}


	public String getSubjectTeacher() {
		return SubjectTeacher;
	}


	public void setSubjectTeacher(String subjectTeacher) {
		SubjectTeacher = subjectTeacher;
	}
	
	
	
	
}
