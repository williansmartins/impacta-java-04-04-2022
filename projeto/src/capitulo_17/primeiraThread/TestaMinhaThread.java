package capitulo_17.primeiraThread;

public class TestaMinhaThread {

	public static void main(String[] args) {
		MinhaThread thread1 = new MinhaThread("#1");
		thread1.start();
		
		MinhaThread thread2 = new MinhaThread("#2");
		thread2.start();
		
		MinhaThread thread3 = new MinhaThread("#3");
		thread3.start();
	}
}
