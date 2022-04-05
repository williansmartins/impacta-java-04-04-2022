package capitulo_17;

public class ThreadSincronizacao extends Thread {

	private String nome;

	public ThreadSincronizacao(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void run() {
		
		MetodoSincronizado m = new MetodoSincronizado();
		m.execucao(this.nome);
		
		System.out.println("Terminou de executar a thread: " + this.nome);
	}
}
