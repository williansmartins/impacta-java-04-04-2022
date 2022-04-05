package capitulo_17;


public class MetodoSincronizado {
	
	public synchronized void execucao(String nome){
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread: " + nome + " executando: " + i);			
		}
	}
}
