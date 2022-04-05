package capitulo_17.encerramento;

public class ThreadEncerramento extends Thread{

	private String nome;
	private int tempo;

	public ThreadEncerramento(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Rodando thread: " + this.nome + "-" + i);
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Terminou de executar a thread: " + this.nome);
	}
	
}
