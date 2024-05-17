import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/railworld","root","root");
		PreparedStatement ps = con.prepareStatement("Select * from emp");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("password"));
			System.out.println(rs.getString("mobile"));
			System.out.println("---------------------------------------");
		}
		

	}

}
