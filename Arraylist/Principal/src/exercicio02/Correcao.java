package exercicio02;

import java.util.ArrayList;

public class Correcao {
	private ArrayList<Computador> listacomputadores;

	public void adicionaComputador(ArrayList<Computador> listacomputadores, Computador c1) {
		listacomputadores.add(c1);
	}

	public void imprimir(ArrayList<Computador> listacomputadores) {
		int totalMemoria = 0;
		for (Computador c : listacomputadores) {
			System.out.println(c.toString());
			totalMemoria += c.getMemoria();
		}
		System.out.println("Total da memória " + totalMemoria);
	}

	public Correcao() {
		listacomputadores = new ArrayList<Computador>();
		adicionaComputador(listacomputadores, new Computador(1, 480, 16));
		adicionaComputador(listacomputadores, new Computador(2, 180, 4));
		adicionaComputador(listacomputadores, new Computador(3, 286, 8));

		System.out.println("Saída 1: ");
		imprimir(listacomputadores);

		System.out.println("Saída 2: ");
		adicionaComputador(listacomputadores, new Computador(4, 580, 16));
		imprimir(listacomputadores);

	}

	public static void main(String[] args) {
		new Correcao();
	}
}
