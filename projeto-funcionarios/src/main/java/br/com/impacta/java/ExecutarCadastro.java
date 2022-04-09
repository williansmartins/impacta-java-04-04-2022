package br.com.impacta.java;

import java.util.List;
import java.util.Scanner;

import br.com.impacta.java.dao.DAOException;
import br.com.impacta.java.dao.FuncionarioDAO;
import br.com.impacta.java.model.Funcionario;

public class ExecutarCadastro {

	static FuncionarioDAO dao = new FuncionarioDAO();
	static Funcionario funcionario = new Funcionario();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
//			inserirFuncionario();
			buscarFuncionario();
			
		} catch (DAOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
	
	static void inserirFuncionario() throws DAOException{
		
		System.out.println("Digite o nome do funcionário: ");
		String nome = sc.nextLine();
		funcionario.setNome(nome);
		
		System.out.println("Digite o salário do funcionário: ");
		String salario = sc.nextLine();
		funcionario.setSalario(Double.parseDouble(salario));
		
		System.out.println("Digite o número do cargo do funcionário: ");
		String cargoId = sc.nextLine();
		funcionario.setCargoId(Integer.parseInt(cargoId));
		
		dao.persist(funcionario);
		
		System.out.println("Funcionário cadastrado com sucesso!");
	}
	
	static void buscarFuncionario() throws DAOException {
		System.out.println("Digite o nome do funcionário que deseja buscar: ");
		String nome = sc.nextLine();
		funcionario.setNome(nome);
		
		List<Funcionario> list = dao.findByName(nome);
		if(list.isEmpty()) {
			System.out.println("Não encontrei ninguém com o nome: " + nome);
		}else {
			System.out.println("Foram encontrado(s) " + list.size() + " funcionário(s)");
			System.out.println(list);			
		}
	}

}
