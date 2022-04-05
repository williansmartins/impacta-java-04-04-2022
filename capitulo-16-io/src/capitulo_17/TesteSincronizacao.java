package capitulo_17;

public class TesteSincronizacao {

	public static void main(String[] args) {
		ThreadSincronizacao thread1 = new ThreadSincronizacao("#Thread1");
		ThreadSincronizacao thread2 = new ThreadSincronizacao("#Thread2");		
		ThreadSincronizacao thread3 = new ThreadSincronizacao("#Thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
	
	
}
