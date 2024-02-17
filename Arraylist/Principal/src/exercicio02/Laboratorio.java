package exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Laboratorio {
	private ArrayList<Computador> listacomputadores;

	public void adicionaComputador(ArrayList<Computador> listacomputadores, Computador c1) {
		Scanner sc = new Scanner(System.in);
		int numserie;
		do{
		System.out.println("Informe o número de série: \"0 = Finalizar\"");
		numserie = sc.nextInt();
		if (numserie != 0) {
			System.out.println("Informe a capaciade do HD: ");
			int capHD = sc.nextInt();
			System.out.println("Informe a quantidade de memória: ");
			int memoria = sc.nextInt();
			c1 = new Computador(numserie, capHD, memoria);
			listacomputadores.add(c1);
		}
		}while(numserie != 0);
		sc.close();
	}

	public void imprimir(ArrayList<Computador> listacomputadores) {
		for (Computador c : listacomputadores) {
			System.out.println(c.toString());
		}
	}

	public Laboratorio() {
		listacomputadores = new ArrayList<Computador>();
		adicionaComputador(listacomputadores, null);
		imprimir(listacomputadores);
	}

	public static void main(String[] args) {
		new Laboratorio();
	}
}
