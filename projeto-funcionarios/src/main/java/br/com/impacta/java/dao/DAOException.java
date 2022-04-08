package br.com.impacta.java.dao;

public class DAOException extends Exception {
	
	
	public DAOException(){
		super();
	}
	
	public DAOException(String s){
		super(s);
	}
	
	public DAOException(Throwable t){
		super(t);
	}
	
	public DAOException(String s, Throwable t){
		super(s, t);
	}
}
