import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscreverTexto {

	public static void main(String[] args) {
		try {
			File arquivo = new File("teste.aula");
			FileOutputStream fos = new FileOutputStream(arquivo, false);
			PrintWriter arquivo2 = new PrintWriter(fos);

			arquivo2.print("Nome: ");
			arquivo2.print("Luciana");
			System.out.println();
			arquivo2.print(true);
			arquivo2.print('A');
			arquivo2.print(20);

			arquivo2.close();

		} catch (FileNotFoundException e) {
			e.getMessage();
		}

	}

	public void criarArquivo() throws IOException {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nome do arquivo e extensão: ");
			String nome = sc.next();
			System.out.println("Caminho: ");
			String caminho = sc.next();

			File arquivo = new File(caminho + "/" + nome);
			FileOutputStream fos = new FileOutputStream(arquivo, true);

			fos.close();
			sc.close();
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
	}
	
	public void escreverTexto() {
		Scanner sc = new Scanner(System.in);
		String str;
		try {
			File arquivo = new File("teste.aula");
			FileOutputStream fos =  new FileOutputStream(arquivo, true);
			PrintWriter arquivo2 = new PrintWriter(fos);
			do {
				System.out.println("Informe os dados: ");
				str = sc.next();
				arquivo2.print(str);
				
			} while (!str.equals("FIM"));
			arquivo2.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	public void lerArquivo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Arquivo: ");
		String str = sc.next();
		try {
			Scanner leitor = new Scanner(new File(str));
			while (leitor.hasNext()) {
					System.out.println(leitor.nextLine());
				}
			
		} catch (FileNotFoundException e) {
			e.getMessage();
		}			
		
	}
	
	
}
