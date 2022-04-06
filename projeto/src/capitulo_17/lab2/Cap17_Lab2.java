package capitulo_17.lab2;

public class Cap17_Lab2 {

	public static void main(String[] args) {
		ThreadLab t1 = new ThreadLab("#Thread1");
		ThreadLab t2 = new ThreadLab("#Thread2");
		ThreadLab t3 = new ThreadLab("#Thread3");
		ThreadLab t4 = new ThreadLab("#Thread4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
