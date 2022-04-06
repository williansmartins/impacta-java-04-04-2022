package capitulo_17.finalizacao;

public class MinhaSegundaThread extends Thread{

	private String nome;
	private int tempo;
	
	public MinhaSegundaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		Thread t1 = new Thread(this);
		t1.start();
	}
	
	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Minha segunda Thread esta rodando a Thread: " + this.nome + " - " + i);
				Thread.sleep(tempo);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thread:" + this.nome + " finalizada" );
	}

}
