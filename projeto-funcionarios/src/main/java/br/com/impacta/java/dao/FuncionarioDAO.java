package br.com.impacta.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.impacta.java.model.Funcionario;

public class FuncionarioDAO {

	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/impacta";
	private final String USER = "root";
	private final String PASSWORD = "password";
	
	private PreparedStatement ps;

	private Connection getConnection() throws DAOException {
		try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e);
		}
	}

	private void closeResources(Connection cn, Statement st, ResultSet rs) {

	}

	public void persist(Funcionario func) throws DAOException {
		String querie = "INSERT INTO tab_func (func_name, func_rmnt_val, role_code) VALUES (?, ?, ?)";
		
		try {
			ps = getConnection().prepareStatement(querie);
			ps.setString(1, func.getNome());
			ps.setDouble(2, func.getSalario());
			ps.setInt(3, func.getCargoId());
			
			ps.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Funcionario> findByName(String nome) throws DAOException {
//		SELECT func_code, func_name, func_rmnt_val, role_code
//		FROM tab_func
//		WHERE func_name LIKE ?
		return null;
	}
	
}
