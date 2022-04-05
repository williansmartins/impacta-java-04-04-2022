import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CriacaoDePastas {
	public static void main(String[] args) {
		File pasta = new File("pasta3");
		
		if(!pasta.exists()) {
			pasta.mkdir();
			System.out.println("gerou a pasta!");
		}
		
		try {
			FileOutputStream arquivo = new FileOutputStream("pasta3/arquivoX.txt");
			DataOutputStream dados = new DataOutputStream(arquivo);
			dados.writeChars("IMPACTA");
			System.out.println("gerou arquivo!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
