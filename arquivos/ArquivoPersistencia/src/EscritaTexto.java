import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class EscritaTexto {

	public EscritaTexto() {
		try {
			File arquivo = new File("teste.aula");
			FileOutputStream fos = new FileOutputStream(arquivo, true);

			PrintWriter arquivoTexto = new PrintWriter(fos);

			arquivoTexto.print("Nome:");
			arquivoTexto.print("Luciana");
			arquivoTexto.println();
			arquivoTexto.print(true);
			arquivoTexto.println('A');
			arquivoTexto.println(20);

			arquivoTexto.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		new EscritaTexto();
	}

}