package com.hibernate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Details")
public class StudentAdd {
	@Id
	
	private int age;
	private String BloodGroup;
	
	
	public StudentAdd() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentAdd(int age, String bloodGroup) {
		super();
		this.age = age;
		BloodGroup = bloodGroup;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	
	@Override
	public String toString() {
		return "StudentAdd [age=" + age + ", BloodGroup=" + BloodGroup + "]";
	}

}
