package exercicio01;

public class Questao01 {

	public Questao01() {
		Concorrente umConcorrente = new Concorrente("Pedro", "DEV", "9885975", "Rua floriano peixoto", 897);
		
		Prova umaProva = new Prova(umConcorrente, 9.7);
		
		System.out.println(umaProva.imprimir());
		
	}

	public static void main(String[] args) {
		new Questao01();
	}
}
