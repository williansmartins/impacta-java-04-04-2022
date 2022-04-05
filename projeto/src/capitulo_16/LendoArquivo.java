package capitulo_16;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LendoArquivo {
	public static void main(String[] args) {
		try {
			FileInputStream arquivo = new FileInputStream("arquivoX.txt");
			DataInputStream dados = new DataInputStream(arquivo);
			
			while(true) {
				char c = dados.readChar();
				System.out.println(c);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
