package exercicio14;

public class Principal {

	public Principal() {
		Vereador listavereadores[] = new Vereador[9];
		listavereadores[0] = new Vereador("Nathan", "PL", 7, 2);
		listavereadores[1] = new Vereador("Zanoni", "PL", 4, 1);
		listavereadores[2] = new Vereador("P2", "PL", 22, 10);
		listavereadores[3] = new Vereador("PM", "PL", 12, 4);
		listavereadores[4] = new Vereador("Armange", "PL", 15, 5);
		listavereadores[5] = new Vereador("Bardini", "PL", 3, 1);
		listavereadores[6] = new Vereador("Guto", "PL", 20, 7);
		listavereadores[7] = new Vereador("Gropp", "PL", 7, 4);
		listavereadores[8] = new Vereador("Patricio", "PL", 10, 4);

		System.out.println(calcularApresentados(listavereadores));
		System.out.println(calcularAprovados(listavereadores));
		System.out.println(vereadorAprovado(listavereadores));
		System.out.println(vereadormenorDesempenho(listavereadores));
		System.out.println(desempenhoMedia(listavereadores));
		System.out.println(calcularMediaDesempenhoPorPartido(listavereadores, "PL"));
		System.out.println(calcularTotalProjetosApresentadosPorPartido(listavereadores, "PL"));
		System.out.println(calcularTotalProjetosAprovadosPorPartido(listavereadores, "PSBk"));
		

	}

	public static void main(String[] args) {
		new Principal();
	}

	public int calcularApresentados(Vereador listavereadores[]) {
		int totalapresentados = 0;
		for (Vereador v : listavereadores) {
			totalapresentados += v.getQtdprojetosapresentados();
		}
		return totalapresentados;
	}

	public int calcularAprovados(Vereador listavereadores[]) {
		int totalaprovados = 0;
		for (Vereador v : listavereadores) {
			totalaprovados += v.getQtdprojetosaprovados();
		}
		return totalaprovados;
	}

	public String vereadorAprovado(Vereador listavereadores[]) {
		Vereador maisAprovado = null;
		int maisVotos = Integer.MIN_VALUE;
		String str = "";
		for (Vereador v : listavereadores) {
			if (v.getQtdprojetosapresentados() > maisVotos) {
				maisAprovado = v;
				maisVotos = v.getQtdprojetosapresentados();
				str = "Nome: " + maisAprovado.getNome() + "\nPartido: " + maisAprovado.getPartido() + "\nDesempenho: "
						+ maisAprovado.getDesempenho();
			}
		}
		return str;
	}
	public String vereadormenorDesempenho(Vereador listavereadores[]) {
		Vereador menorDesempenho = null;
		double menos = Integer.MAX_VALUE;
		String str = "";
		for(Vereador v : listavereadores) {
			if (menos > v.getDesempenho()) {
				menorDesempenho = v;
				menos = v.getDesempenho();
				str = "Nome: " + menorDesempenho.getNome() + "\nPartido: " + menorDesempenho.getPartido() + "\nDesempenho: "
						+ menorDesempenho.getDesempenho();
			}
		}
		return str;
	}
	private static double calcularMediaDesempenho(Vereador listavereadores[]) {
		double media = 0;
		double soma = 0;
		for(Vereador v : listavereadores) {
			soma += v.getDesempenho();
			media = soma / listavereadores.length;
		}
		return media;
	}
	public String desempenhoMedia(Vereador listavereadores[]) {
		String str = "";
		for(Vereador v : listavereadores) {
			if (v.getDesempenho() >= calcularMediaDesempenho(listavereadores)) {
				str += "\nNome: " + v.getNome() + "\nPartido: " + v.getPartido() + "\nDesempenho: "
						+ v.getDesempenho();
			}
		}
		return str;
	}
	private static double calcularMediaDesempenhoPorPartido(Vereador[] vereadores, String partidoNumero) {
        int totalProjetos = 0;
        double totalDesempenho = 0;
        for (Vereador vereador : vereadores) {
            if (vereador.getPartido().equals(partidoNumero)) {
                totalProjetos += vereador.getQtdprojetosapresentados();
                totalDesempenho += vereador.getDesempenho();
            }
        }
        return totalDesempenho / totalProjetos;
    }
	private static int calcularTotalProjetosApresentadosPorPartido(Vereador[] vereadores, String partidoNumero) {
        int totalProjetos = 0;
        for (Vereador vereador : vereadores) {
            if (vereador.getPartido().equals(partidoNumero)) {
                totalProjetos += vereador.getQtdprojetosapresentados();
            }
        }
        return totalProjetos;
    }

    private static int calcularTotalProjetosAprovadosPorPartido(Vereador[] vereadores, String partidoNumero) {
        int totalProjetos = 0;
        for (Vereador vereador : vereadores) {
            if (vereador.getPartido().equals(partidoNumero)) {
                totalProjetos += vereador.getQtdprojetosaprovados();
            }
        }
        return totalProjetos;
    }
}
