package com.hibernate;

import javax.persistence.*;

@Entity
@Table(name="Student_Railworld")
public class Student {
	 @Id
      private int id;
      private String name;
      private String Sirname;
      public Student() {
  		super();
  		// TODO Auto-generated constructor stub
  	}
	
	public Student(int id, String name, String sirname) {
		super();
		this.id = id;
		this.name = name;
		Sirname = sirname;
	}

	public String getSirname() {
		return Sirname;
	}
	public void setSirname(String sirname) {
		Sirname = sirname;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Sirname=" + Sirname + "]";
	}
	
	 
      
      
    
    
}
