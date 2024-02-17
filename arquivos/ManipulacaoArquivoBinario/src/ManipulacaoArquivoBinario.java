import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class ManipulacaoArquivoBinario {
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		File f = new File("C:\\Users\\Pedro\\exemplo.txt");
		
		FileOutputStream a = new FileOutputStream(f);
		
		a.write(90);
		a.write(100);
		a.write(200);
		
		a.close();
		
		FileInputStream fis = new FileInputStream(f);
		
		int dado;
		while(true) {
			dado = fis.read();
			if (dado != -1) {
				System.out.println(dado);
			}
			else {
				break;
			}
		}
	fis.close();
	}
	
}
