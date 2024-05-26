package com.HibernateAnnotations;

import java.util.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;



@Entity
@Table(name="Employee_Details")
public class AnnotationsDemo {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="Emp_ID")
     private int id;
	 
	 @Column(name ="Emp_Name" , length=50)
     private String name;
	 
     private int Age;
     
     @Column(name="Emp_Address")
     private String Address;
     
     
     private boolean isWorking;
     
   @Transient
     private double x;
     
     @Temporal(TemporalType.DATE)
     private Date JoiningDate;
     
     @Lob
     private byte[] image;
     
     
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
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public boolean isWorking() {
		return isWorking;
	}
	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getJoiningDate() {
		return JoiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		JoiningDate = joiningDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public AnnotationsDemo(int id, String name, int age, String address, boolean isWorking, double x, Date joiningDate,
			byte[] image) {
		super();
		this.id = id;
		this.name = name;
		Age = age;
		Address = address;
		this.isWorking = isWorking;
		this.x = x;
		JoiningDate = joiningDate;
		this.image = image;
	}
	public AnnotationsDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AnnotationsDemo [id=" + id + ", name=" + name + ", Age=" + Age + ", Address=" + Address + ", isWorking="
				+ isWorking + ", x=" + x + ", JoiningDate=" + JoiningDate + ", image=" + Arrays.toString(image) + "]";
	}
     
     
     
}
