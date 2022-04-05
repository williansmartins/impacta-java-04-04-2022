package capitulo_17.primeiraThread;

public class MinhaThread extends Thread{

	private String nome;
	
	MinhaThread(String nome){
		this.nome = nome;
	}
	
	@Override
	public void run(){
		
		try {
			for(int i=0; i<1000; i++) {
				System.out.println("Thread " + this.nome + " em execução - " + i);
				Thread.sleep(500);
			}
			System.out.println("Thread " + this.nome + " finalizou!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
