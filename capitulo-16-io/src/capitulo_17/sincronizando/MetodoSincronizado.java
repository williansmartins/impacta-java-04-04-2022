package capitulo_17.sincronizando;


public class MetodoSincronizado {
	
	public synchronized void execucao(String nome){
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread: " + nome + " executando: " + i);
//					Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
