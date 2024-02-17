import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ManipulacaoBuffer {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		OutputStream os = new FileOutputStream("C:\\Users\\Pedro\\file.txt");
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter br = new BufferedWriter(wr);
		
		String m[][] = {{"João", "Ilhota", "20"},
						{"Maria", "Gaspar", "23"}};
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				br.write(m[i][j] + ";");
			}
		}
		br.close();
		
		FileInputStream stream = new FileInputStream("C:\\Users\\Pedro\\file.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader brx = new BufferedReader(reader);
		
		String linha = brx.readLine();
		while(linha != null) {
			String[] textoSeparado = linha.split(";");
			System.out.println(textoSeparado[0]);
			System.out.println(textoSeparado[1]);
			System.out.println(textoSeparado[2]);
		
			
			linha = brx.readLine();
		}
		brx.close();
	}
}
