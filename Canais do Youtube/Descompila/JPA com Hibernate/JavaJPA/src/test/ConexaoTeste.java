package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoTeste {
	
	public static void main(String[] args) throws ClassNotFoundException {

		// Configurações da conexão
        String url = "jdbc:mysql://localhost:3306/dbhibernate";
        String user = "root"; 
        String password = "123456";
        String classDb = "com.mysql.cj.jdbc.Driver";

        try {
        	Class.forName(classDb);
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem-sucedida!");
            connection.close();
            

        } catch (SQLException e) {
            System.out.println("Falha na conexão!");
            e.printStackTrace(); 
        }
	}


}
