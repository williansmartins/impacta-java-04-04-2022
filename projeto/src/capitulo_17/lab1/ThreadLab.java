package capitulo_17.lab1;

public class ThreadLab extends Thread{

	ThreadLab(String a){
		super(a);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread: " + this.getName() + "-" + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	
}
