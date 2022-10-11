import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/javaapp";
		String username="root";
		String password="root123";
		//Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection established!!");
		
		String sqlInsert="insert into Pets(Pet_Name,Owner_Name,DOB,Sex,Species) values(?,?,?,?,?)";
		PreparedStatement prestat=con.prepareStatement(sqlInsert);
		prestat.setString(1,"Reggie");
		prestat.setString(2,"Ms.Zubair");
		prestat.setString(3,"2002-11-30");
		prestat.setString(4,"F");
		prestat.setString(5,"Cat");
		prestat.executeUpdate();
		System.out.println("Record inserted ");
		prestat.clearParameters();
		prestat.close();
		con.close();
	}

}