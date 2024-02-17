package exercicio05;

import java.util.HashMap;
import java.util.Scanner;

public class TesteImposto {
	private HashMap<String, ImpostoDeRenda> listacpfs;

	public TesteImposto() {
		Scanner sc = new Scanner(System.in);
		adicionarPessoa(sc);
		System.out.println("Informe o cpf de algum contribuinte: ");
		String cpf = sc.next();
		System.out.println(cpfContribuinte(cpf));
		System.out.println("\nMaior pagados de impostos: \n" + maiorImposto());

		sc.close();
	}

	public String cpfContribuinte(String cpf) {
		String dados = "Não foi possível achar o cpf dentro de nossa lista.";
		for (ImpostoDeRenda p : listacpfs.values()) {
			if (p.getCpf().equals(cpf)) {
				dados = "Nome: " + p.getNome() + "\nCPF: " + p.getCpf() + "\nRenda: " + p.getRenda() + "\nImposto: "
						+ p.calcularImposto();
			}

		}
		return dados;
	}

	public void adicionarPessoa(Scanner sc) {
		String nome;
		listacpfs = new HashMap<String, ImpostoDeRenda>();
		ImpostoDeRenda pessoa = null;
		do {
			System.out.println("Informe o nome: \nInforme sair para finalizar.");
			nome = sc.next();
			if (!nome.equalsIgnoreCase("sair")) {
				System.out.println("Informe o cpf: ");
				String cpf = sc.next();
				System.out.println("Informe a sua renda anual: ");
				double renda = sc.nextDouble();
				pessoa = new ImpostoDeRenda(nome, cpf, renda);
				listacpfs.put(cpf, pessoa);
			}
		} while (!nome.equalsIgnoreCase("sair"));
		
	}
	public String maiorImposto() {
		ImpostoDeRenda maiorimposto = null;
		double maiorvalor = Double.MIN_VALUE;
		for(ImpostoDeRenda p : listacpfs.values()) {
			double imposto = p.calcularImposto();
			if (maiorvalor < imposto) {
				maiorimposto = p;
				maiorvalor = imposto;
			}
		}
		return "Nome: " + maiorimposto.getNome() + "\nCPF: " + maiorimposto.getCpf() + "\nRenda: " + maiorimposto.getRenda() + "\nImposto: "
				+ maiorimposto.calcularImposto();
	}

	public static void main(String[] args) {
		new TesteImposto();
	}
}
