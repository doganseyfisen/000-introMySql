package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseExample {
	public static void main(String[] args) {
		baglanti();
		}
	public static void baglanti() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Database tipi
			Connection connection = 
					DriverManager.getConnection("jdbc:myssql://localhost:3306/DatabaseExample","root","12345");
			// Baglanti nesnesi
			Statement state = connection.createStatement();
			ResultSet sonuc = state.executeQuery("Calistirilacak SQL komutu");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
