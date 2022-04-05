package capitulo_17.maosAObra;

public class Cap17_Lab2 {
	public static void main(String args[]){
		ThreadLabNew t1 = new ThreadLabNew("Thread 1");
		ThreadLabNew t2 = new ThreadLabNew("Thread 2");
		
		t1.start();
		t2.start();
	}
}
