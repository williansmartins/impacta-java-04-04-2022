import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CriacaoDeArquivos {
	public static void main(String[] args) {
		System.out.println("Olá Mundo!");
		
		//criacao de arquivo (servidor)
		try {
			FileOutputStream arquivo = new FileOutputStream("pasta1/arquivoX.jpg");
			DataOutputStream dados = new DataOutputStream(arquivo);
			dados.writeChars("IMPACTA");
			System.out.println("gerou arquivo!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
