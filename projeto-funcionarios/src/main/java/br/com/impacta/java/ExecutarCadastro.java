package br.com.impacta.java;

import br.com.impacta.java.dao.DAOException;
import br.com.impacta.java.dao.FuncionarioDAO;
import br.com.impacta.java.model.Funcionario;

public class ExecutarCadastro {

	public static void main(String[] args) {
		FuncionarioDAO dao = new FuncionarioDAO();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setCargoId(1);
//		funcionario.setId(1);
		funcionario.setNome("Willians Martins");
		funcionario.setSalario(20000);
		
		try {
			dao.persist(funcionario);
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

}
