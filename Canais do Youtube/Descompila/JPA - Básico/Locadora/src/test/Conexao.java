package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static void main(String[] args) throws ClassNotFoundException {

		// Configurações da conexão
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root"; 
        String password = "123456";
        String classDb = "com.mysql.jdbc.Driver";

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

/*
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	// Configurações da conexão
	static String url = "jdbc:mysql://localhost:3306/mydb";
	static String user = "igormanoels"; 
	static String password = "123456";
	static String classDb = "com.mysql.jdbc.Driver";
	
	public static Connection conectar() throws SQLException {
		Connection conexao = DriverManager.getConnection(url, user, password);
		return conexao;
	}

	public static void main(String[] args) {
		try {
			Connection conexao = Conexao.conectar();
			System.out.println("Conectado com Sucesso !!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Conexão falhou !!");
		}
	}
}
*/