import java.sql.*;

public class ConexionBD{

	String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
				"databaseName=escuela;integratedSecurity=false;";

	// Declare the JDBC objects.
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql;

	public ConexionBD(String sql){
		this.sql = sql;
	}

	public void realizarConsulta(){
		try {
			// Establish the connection.
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con = DriverManager.getConnection(connectionUrl,"sa","contrasena");// cambiar

			// Create and execute an SQL statement that returns some data.
			String SQL = this.sql;
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}
		}
		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
			if (stmt != null) try { stmt.close(); } catch(Exception e) {}
			if (con != null) try { con.close(); } catch(Exception e) {}
		}
	}
}