import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraTexto {

	public LeituraTexto() {
		try {
//			Scanner leitor = new Scanner(new File("C:\\Users\\Public\\Texto.aula"));
			Scanner leitor = new Scanner(new File("C:/Users/Public/Texto.aula"));
			
			//Lê o arquivo todo do início ao fim:
//			while (leitor.hasNext()) { //tem linhas a serem lidas?
//				System.out.println(leitor.nextLine());
//			}
			
			String aula = leitor.nextLine();
			String turma = leitor.nextLine();
			int ano = leitor.nextInt();
			
			System.out.println("Informações da turma: \n" + aula + " " + turma);
			System.out.println("Ano: " + ano);
			
			leitor.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new LeituraTexto();
	}

}