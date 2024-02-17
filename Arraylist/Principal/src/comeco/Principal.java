package comeco;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	private ArrayList<Pessoa> listaNomes;

	public Principal() {
		listaNomes = new ArrayList<Pessoa>();
		popular();
		imprimir();
		}

	private void imprimir() {
		//for (int i = 0; i < listaNomes.size(); i++) {
		//	System.out.println(listaNomes.get(i).toString());
		//}
		for(Pessoa p : listaNomes) {
			System.out.println(p.toString());
		}
	}

	private void popular() {
		Scanner sc = new Scanner(System.in);
		String nome;
		do {
			System.out.println("Digite um nome ou \"fim\" para sair");
			nome = sc.next();
			if (!nome.equalsIgnoreCase("fim")) {
				System.out.println("Digite a idade: ");
				int idade = sc.nextInt();
				Pessoa p = new Pessoa(nome, idade);
				listaNomes.add(p);
			}

		} while (!nome.equalsIgnoreCase("fim"));
		sc.close();
	}

	public static void main(String[] args) {
		new Principal();
	}
}
