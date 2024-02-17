import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {
	public static void main(String[] args) {

		try {

			Scanner leitor = new Scanner(new File("C:/Users/Pedro/Downloads/aula.texto.txt"));

			//while (leitor.hasNext()) {
		//		System.out.println(leitor.nextLine());
			//}
			
			String vale = leitor.nextLine();
			String div = leitor.nextLine();
			
			System.out.println("Informações da vale: "  + vale);
			System.out.println("Dividendos: " + div);
			
			leitor.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
}
