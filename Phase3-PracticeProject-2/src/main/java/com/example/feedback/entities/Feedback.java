package com.example.feedback.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Feedback {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String comments;
	private int rating;
	private String user;
	
	public Feedback() {
		
	}

	public Feedback(String comments, int rating, String user) {
		super();
		this.id = id;
		this.comments = comments;
		this.rating = rating;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString()
	{
		return(
	            "<style>\n" + 
	            "table {\n" + 
	            "  font-family: Arial, Helvetica, sans-serif;\n" + 
	            "  border-collapse: collapse;\n" + 
	            "  width: 100%;\n" + 
	            "}\n" + 
	            "\n" + 
	            "table td, table th {\n" + 
	            "  border: 1px solid #ddd;\n" + 
	            "  padding: 8px;\n" + 
	            "}\n" + 
	            "\n" + 
	            "table tr:nth-child(even){background-color: #f2f2f2;}\n" + 
	            "\n" + 
	            "table tr:hover {background-color: #9ACD32;}\n" + 
	            "\n" + 
	            "table th {\n" + 
	            "  padding-top: 12px;\n" + 
	            "  padding-bottom: 12px;\n" + 
	            "  text-align: left;\n" + 
	            "  background-color: #4287f5;\n" + 
	            "  color: white;\n" + 
	            "}\n" + 
	            "</style>"
	            + "<table border='2' style='margin-left: auto;\n" + 
	            "  margin-right: auto;width:50%;'>"
	            +"<tr>"
	            +"<th> Id </th>"
	            +"<th> Name </th>"
	            +"<th> Rating </th>"
	            +"<th> Comments </th>"
	            +"</tr>"
	            +"<td>"+id+"</td>"
	            +"<td>"+user+"</td>"
	            +"<td>"+rating+ "</td>"
	            +"<td>"+comments+"</td>"
	            +"</tr>"
	            +"</table>");
	}
}

