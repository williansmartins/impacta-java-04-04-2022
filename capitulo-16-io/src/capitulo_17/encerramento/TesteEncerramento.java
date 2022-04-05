package capitulo_17.encerramento;

import capitulo_17.threadv1Extends.MinhaThread;

public class TesteEncerramento {
	public static void main(String[] args) {
		MinhaThread thread1 = new MinhaThread("#Thread1", 100);
		thread1.start();

		MinhaThread thread2 = new MinhaThread("#Thread2", 200);
		thread2.start();

		MinhaThread thread3 = new MinhaThread("#Thread3", 500);
		thread3.start();

		// estrategia1
//		try {
//			for (int i = 0; i < 5; i++) {
//				Thread.sleep(500);
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		//estrategia2
//		try {
//			while(thread1.isAlive()| thread2.isAlive() | thread3.isAlive()) {
//				Thread.sleep(500);
//			}
//		}
//		catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		//estrategia3
//		try {
//			thread1.join();
//			thread2.join();
//			thread3.join();
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		System.out.println("Terminei de executar todas as Threads <---------------------");
	}
}
