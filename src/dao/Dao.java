package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	
	private static final String URI = "jdbc:postgresql://10.130.163.151/Veiculo_BD";
	private static final String USER = "postgres";
	private static final String PWD = "postgres";
	
	
	private static Connection conn = null; 
	
	
	public static Connection getConection() throws SQLException, ClassNotFoundException{
		if(conn == null){
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(URI, USER, PWD); 
		}
		return conn;
	}
	
	//postgres
/*public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC não encontrado");
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(URI, USER, PWD);
		} catch (SQLException e) {
			System.out.println("uri, user ou senha incorretos");
			e.printStackTrace();
		}
		
	}*/
	
	//hypersql
	//Atenção: ao usar com o hypersql está dando erro no preparestatment no entanto com o postgres funcionou
	/*private static final String USER = "SA";
	private static final String PWD = "";
	private static final String DB_name = "Veiculo_BD";
	private static final String JDBC_DRIVER = "org.hsqldb.jdbc.JDBCDriver";
	private static final String URI = "jdbc:hsqldb:file:"+DB_name;
	
	private static Connection conn = null;
	
	public static Connection getConection() throws ClassNotFoundException, SQLException{
		if(conn == null){
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(URI, USER, PWD);
		}
		
		return conn;
	}*/
	//
	
	//hypersql
	/*public static void main(String[] args) {
		
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC não encontrado");
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(URI, USER, PWD);
		} catch (SQLException e) {
			System.out.println("uri, user ou senha incorretos");
			e.printStackTrace();
		}
		
		System.out.println("ok");
	}*/
}
