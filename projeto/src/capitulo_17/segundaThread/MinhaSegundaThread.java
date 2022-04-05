package capitulo_17.segundaThread;

public class MinhaSegundaThread implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Minha segunda Thread esta rodando - " + i);
		}
	}

}
