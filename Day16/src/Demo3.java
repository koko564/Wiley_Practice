import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;

//import com.sun.xml.internal.ws.wsdl.writer.document.Types;

public class Demo3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/javaapp";
		String username="root";
		String password="root123";
		//Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection(url, username, password);
		/*
		 * con.createStatement() : statement
		 * con.preparedStatement(String sql) : PreparedStatement
		 * con.prepareCall({String sql which represents query to invoke procedure}): CallableStatement 
		 */		
		CallableStatement callableStatement=con.prepareCall("{call countPets()}");		
		ResultSet rs=callableStatement.executeQuery();
		while(rs.next()) {
			System.out.println("No. of Pets: "+rs.getString(1));
		}
		
		CallableStatement callableStatement1=con.prepareCall("{call getPetAge(?,?)}");
		
		callableStatement1.setInt(1, 4);
		callableStatement1.registerOutParameter(2, java.sql.Types.INTEGER);
		
		callableStatement1.executeUpdate();
		String holderType=callableStatement1.getString(2);
		System.out.println("Age: "+holderType);
		
		con.close();
	}

}