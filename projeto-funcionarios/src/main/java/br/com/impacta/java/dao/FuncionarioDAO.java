package br.com.impacta.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.java.model.Funcionario;

public class FuncionarioDAO {

	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/impacta";
	private final String USER = "root";
	private final String PASSWORD = "password";

	private PreparedStatement ps;
	private Connection con;
	private ResultSet rs;

	private Connection getConnection() throws DAOException {
		try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("Erro ao tentar fazer a conexao", e);
		}
	}

	private void closeResources(Connection cn, Statement st, ResultSet rs) throws DAOException {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) { throw new DAOException(e);}
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) { throw new DAOException(e);}
		}
		if (cn != null) {
			try {
				cn.close();
			} catch (SQLException e) { throw new DAOException(e);}
		}

	}

	public void persist(Funcionario func) throws DAOException {
		String query = "INSERT INTO tab_func (func_name, func_rmnt_val, role_code) VALUES (?, ?, ?)";

		try {
			con = getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, func.getNome());
			ps.setDouble(2, func.getSalario());
			ps.setInt(3, func.getCargoId());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("Erro ao tentar inserir um funcionario", e);
		} finally {
			closeResources(con, ps, null);
		}
	}

	public List<Funcionario> findByName(String nome) throws DAOException {
		String query = "SELECT func_code, func_name, func_rmnt_val, role_code " + 
		"FROM tab_func " +
		"WHERE func_name LIKE ?";
		
		try {
			con = getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, "%"+nome+"%");
			
			rs = ps.executeQuery();
			
			ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
			
			while(rs.next()) {
				Funcionario f = new Funcionario();
				f.setId(rs.getInt(1));
				f.setNome(rs.getString(2));
				f.setSalario(rs.getDouble(3));
				f.setCargoId(rs.getInt(4));
				
				lista.add(f);
			}
			
			return lista;
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("Erro ao buscar um funcionario", e);
		}finally {
			closeResources(con, ps, rs);
		}
		
	}

}
