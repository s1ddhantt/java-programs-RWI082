import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class updateDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/railworld","root","root");
		System.out.println("Driver Connected");
		
		String name = "rickey";
		String mobile = "12345";
		
		PreparedStatement ps = con.prepareStatement("update emp set name=? where mobile=?");
		ps.setString(1, name);
		ps.setString(2, mobile);
		
		int count = ps.executeUpdate();
		
		if(count>0) {
			System.out.println("Record Updated Successfully !");
		}
		else {
			System.out.println("Record Updation Failed !");
		}

	}

}
