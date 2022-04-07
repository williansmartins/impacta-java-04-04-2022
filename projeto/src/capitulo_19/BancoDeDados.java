package capitulo_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {
	public static void main(String[] args) throws SQLException {
		new BancoDeDados().abrirConexao();
	}
	
	void abrirConexao() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=password");
		System.out.println("conexao efetuada!");
		System.out.println(connection.getClass());
	}
}
