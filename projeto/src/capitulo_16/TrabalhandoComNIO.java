package capitulo_16;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TrabalhandoComNIO {
	public static void main(String[] args) {

		Path caminho = Paths.get("arquivo.txt");
		Path caminho2 = Paths.get("../");
		
		System.out.println(caminho.getFileName());
	}
}
