package capitulo_17.threadv2Runnable;

public class MinhaSegundaThread implements Runnable{

	private String nome;

	public MinhaSegundaThread(String nome) {
		this.nome = nome;
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Rodando thread: " + this.nome + "-" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Terminou de executar a thread: " + this.nome);
	}
	
}
