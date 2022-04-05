package capitulo_17;

public class TesteMinhaThread {

	public static void main(String[] args) {
		MinhaThread thread = new MinhaThread("#Thread1", 100);
		thread.start();
		
		MinhaThread thread2 = new MinhaThread("#Thread2", 200);
		thread2.start();
		
		MinhaThread thread3 = new MinhaThread("#Thread3", 500);
		thread3.start();
	}
	
	
}
