package  br.com.lista10.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public static Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");

			return DriverManager.getConnection("jdbc:postgresql://localhost/desweb","postgres", "root");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
