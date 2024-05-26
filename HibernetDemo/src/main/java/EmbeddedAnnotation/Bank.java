package EmbeddedAnnotation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bank_Details")
public class Bank {
 
	  @Id
	  private int id;
	 private String Bankname;
	 private String IFSCCode;
	 
	 private Employee employee;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int id, String bankname, String iFSCCode, Employee employee) {
		super();
		this.id = id;
		Bankname = bankname;
		IFSCCode = iFSCCode;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankname() {
		return Bankname;
	}

	public void setBankname(String bankname) {
		Bankname = bankname;
	}

	public String getIFSCCode() {
		return IFSCCode;
	}

	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", Bankname=" + Bankname + ", IFSCCode=" + IFSCCode + ", employee=" + employee + "]";
	}

	 
	 
	 
}
