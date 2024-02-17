package inicio;

import java.io.File;

public class ManipulacaoArquivo {
	public static void main(String[] args) {
		File dir = new File("C:\\Users\\Pedro");
		File conteudoDir[] = dir.listFiles();
		long total = 0;
		
		for (File file : conteudoDir) {
			if (file.isDirectory()) {
				System.out.println("<Dir> " + file.getName());
			}
			else {
				total += file.length();
				System.out.println(file.getName());
			}
		}
		
		System.out.println("Total Arquivos: " + total + "\nTotal tamanho: " + conteudoDir.length);
	}
}
