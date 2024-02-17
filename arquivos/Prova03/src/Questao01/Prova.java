package Questao01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Pedro Krubniki Albuquerque

public class Prova {
	public static void main(String[] args) {
		String arqOrigem = "C:\\Users\\Pedro\\Documents\\estudos\\Projeto java\\segundo semestre\\POO\\arquivos\\Prova03\\questao1exc.csv";
		String arqDestino = "C:\\Users\\Pedro\\Documents\\estudos\\Projeto java\\segundo semestre\\POO\\arquivos\\Prova03\\questao1serializada.csv";

		try {
			serializar(arqOrigem, arqDestino);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void serializar(String arqOrigem, String arqDestino) throws IOException {
		File arquivoSaida = new File(arqDestino);
		FileOutputStream fos = new FileOutputStream(arquivoSaida, false);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		String linha;

		try (BufferedReader br = new BufferedReader(new FileReader(arqOrigem))) {
			while ((linha = br.readLine()) != null) {
				String[] data = linha.split(";");
				String nome = data[0];
				String cpf = data[1];
				float altura = Float.parseFloat(data[2]);
				float peso = Float.parseFloat(data[3]);
				String rua = data[4];
				String num = data[5];
				String complemento = data[6];
				String cep = data[7];
				String cidade = data[8];
				String estado = data[9];

				oos.writeObject(new Atleta(nome, cpf, altura, peso));
				oos.writeObject(new Endereco(rua, num, complemento, cep, cidade, estado));
			}
		} catch (EArquivoOrigemIncorreto e) {
			e.getMessage();
		}

		oos.close();
	}
}
