package EmbeddedAnnotation;

import javax.persistence.Embeddable;

@Embeddable
public class Employee {

      private String employeeName;
      private int EmployeeSalary;
      private String Designation;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, int employeeSalary, String designation) {
		super();
		this.employeeName = employeeName;
		EmployeeSalary = employeeSalary;
		Designation = designation;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", EmployeeSalary=" + EmployeeSalary + ", Designation="
				+ Designation + "]";
	}
      
      
}
