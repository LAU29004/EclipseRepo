import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {
		try {
			Connection conn = JdbcFactory.getConnection();
			System.out.println("Connection successful");
			
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB name: "+meta.getDatabaseProductName());
			System.out.println("DB Version: "+ meta.getDatabaseProductVersion());
			System.out.println("Driver Name: "+ meta.getDriverName());
			System.out.println("Driver Version: "+ meta.getDriverVersion());
		} catch (SQLException e) {
			System.out.println("Connection failed due to...	");
			e.printStackTrace();
		}
	}

}
