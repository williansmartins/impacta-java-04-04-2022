package capitulo_17;


public class BlocoSincronizado {
	
	public void testar(){
		
		System.out.println("Nao sincronizado");
		synchronized(this){
			System.out.println("Sincronizado");
		}
	}
}
