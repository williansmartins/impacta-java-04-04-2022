package capitulo_17.finalizacao;


public class TestaSegundaThread {

	public static void main(String[] args) {
		MinhaSegundaThread thread1 = new MinhaSegundaThread("#1", 100);
		MinhaSegundaThread thread2 = new MinhaSegundaThread("#2", 500);
		MinhaSegundaThread thread3 = new MinhaSegundaThread("#3", 1000);
		MinhaSegundaThread thread4 = new MinhaSegundaThread("#4", 200);
		
		//estrategia1
//		try {
//			Thread.sleep(10000);
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		//estrategia2
//		while(thread1.isAlive() | thread2.isAlive() | thread3.isAlive() | thread4.isAlive()) {
//			
//		}
		
		//estrategia3
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Threads executadas com sucesso <--------------" );
	}

}
