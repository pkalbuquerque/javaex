import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ManipulacaoDeArquivo {

	public ManipulacaoDeArquivo() {
		
		try {
			escreverArquivo();
			lerArquivo();
			
		} catch (IOException e) {
			e.getMessage();
		} catch (ClassNotFoundException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
	}
	
	private void escreverArquivo() throws IOException {
		File arquivo = new File("arqserializado.bin");
		FileOutputStream fos = new FileOutputStream(arquivo, false);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject("Exemplo de gravação serializaada");
		oos.writeObject(new Pessoa("Luciana", "123456789"));
		oos.writeObject(new Livro("Titulo", "Autor"));
		
		oos.close();
		
	}
	
	private void lerArquivo() throws IOException, ClassNotFoundException {
		File arquivo = new File("arqserializado.bin");
		FileInputStream fis = new FileInputStream(arquivo);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		String frase = (String) ois.readObject();
		Pessoa pessoa = (Pessoa) ois.readObject();
		Livro livro = (Livro) ois.readObject();
		
		fis.close();
		
		
		
		
		
		System.out.println("Frase: " + frase);
		System.out.println(pessoa.toString());
		System.out.println(livro);
	}
	
	public static void main(String[] args)  {
		new ManipulacaoDeArquivo();
	}
}
