package capitulo_17.sincronizando;


public class BlocoSincronizado {
	
	public void testar(){
		
		System.out.println("Nao sincronizado");
		synchronized(this){
			System.out.println("Sincronizado");
		}
	}
}
