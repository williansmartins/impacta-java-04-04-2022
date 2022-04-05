package capitulo_16;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListagemDeDiretorio {
	public static void main(String[] args) {
		Path pasta = Paths.get("");
		
		try {
			Files.list(pasta).forEach(f -> {
				System.out.println(f.getFileName());
				Path x = f.getFileName();
				boolean directory = Files.isDirectory(x, null);
				System.out.println(directory);
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
