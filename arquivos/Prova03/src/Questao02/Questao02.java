package Questao02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

//Pedro Krubniki Albuquerque
public class Questao02 {
	private static HashMap<String, Integer> cidades;

	public static void main(String[] args) {

		ArrayList<Acidente> acidentes = new ArrayList<>();
		cidades = new HashMap<>();
		String linha;
		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\Pedro\\Documents\\estudos\\Projeto java\\segundo semestre\\POO\\arquivos\\Prova03\\questao2.csv"))) {
			linha = br.readLine();
			while ((linha = br.readLine()) != null) {
				String[] data = linha.split(";");
				String cidade = data[0];
				String tipoVeiculo = data[1];
				int numAcidentes = Integer.parseInt(data[2]);
				String estCivil = data[3];

				Acidente acidente = new Acidente(cidade, tipoVeiculo, numAcidentes, estCivil);

				acidentes.add(acidente);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(cidadeMaiorNumAcidentes(acidentes));
		System.out.println(separadasPorVeiculo(acidentes));
		System.out.println(separadaPorEstCivil(acidentes));
		System.out.println(percentualEstCivil(acidentes));
	}

	public static String cidadeMaiorNumAcidentes(ArrayList<Acidente> acidentes) {
		String maiorCidade = "";
		for (Acidente acidente : acidentes) {
			String nomeCidade = acidente.getCidade();
			if (cidades.containsKey(acidente.getCidade())) {
				int valoratual = cidades.get(nomeCidade);
				cidades.put(acidente.getCidade(), valoratual + 1);
			} else {
				cidades.put(acidente.getCidade(), 1);
			}
		}
		int maiscasos = Integer.MIN_VALUE;

		for (String cidade : cidades.keySet()) {
			if (maiscasos < cidades.get(cidade)) {
				maiscasos = cidades.get(cidade);
				maiorCidade = cidade;
			}
		}

		return maiorCidade;
	}

	public static String separadasPorVeiculo(ArrayList<Acidente> acidentes) {
		String cidade = cidadeMaiorNumAcidentes(acidentes);
		String str = "";
		for (Acidente acidente : acidentes) {
			if (acidente.getCidade().equals(cidade)) {
				str += acidente.getTipoVeiculo() + ":" + acidente.getNumAcidentes() + "\n";
			}
		}
		return str;
	}

	public static String separadaPorEstCivil(ArrayList<Acidente> acidentes) {
		String cidade = cidadeMaiorNumAcidentes(acidentes);
		int num = Integer.MIN_VALUE;
		String str = "";
		for (Acidente acidente : acidentes) {
			if (acidente.getCidade().equals(cidade)) {
				if (num < acidente.getNumAcidentes()) {
					num = acidente.getNumAcidentes();
				}
				if (num == acidente.getNumAcidentes()) {
					str += acidente.getEstCivil();
				}
			}
		}
		return "O estado civil com maior incidência: " + str;
	}

	public static String percentualEstCivil(ArrayList<Acidente> acidentes) {
		int solteiro = 0;
		int casado = 0;
		int div = 0;
		for (Acidente acidente : acidentes) {
			if (acidente.getEstCivil().equals("solteiro")) {
				solteiro += acidente.getNumAcidentes();
			}
			if (acidente.getEstCivil().equals("casado")) {
				casado += acidente.getNumAcidentes();
			}
			if (acidente.getEstCivil().equals("divorciado")) {
				div += acidente.getNumAcidentes();
			}
		}
		int total = solteiro + casado + div;
		return "Solteiros: " + solteiro * 100f / total + "%" + "\nCasados: " + casado * 100f / total + "%"
				+ "\nDivorciados: " + div * 100f / total + "%";
	}
}
