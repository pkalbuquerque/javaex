package exercicio05;

import java.util.Arrays;

//Pedro Albuquerque e Diogo Pereira

public class SetorPessoal {
	private Funcionario[] listaFuncionarios;
	private int indice;

	public SetorPessoal(int tamanho) {
		listaFuncionarios = new Funcionario[tamanho];
		setIndice(0);
	}

	public Funcionario[] getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(Funcionario[] listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	// Método para adicionar funcionários
	public void adicionarFuncionario(Funcionario funcionario) {
		if (indice < listaFuncionarios.length) {
			listaFuncionarios[indice] = funcionario;
			indice++;
		} else {
			System.out.println("O vetor de funcionários está cheio.");
		}
	}

	// Método para imprimir a folha de pagamento
	public void imprimirFolhaPagamento() {
		System.out.println("Folha de Pagamento:");
		for (int i = 0; i < indice; i++) {
			System.out.println(
					"Nome: " + listaFuncionarios[i].getNome() + " - Salário: " + listaFuncionarios[i].getSalario());
		}
	}

	// Método para retornar o valor total da folha de pagamento
	public double calcularTotalFolhaPagamento() {
		double total = 0;
		for (int i = 0; i < indice; i++) {
			total += listaFuncionarios[i].getSalario();
		}
		return total;
	}

	// Método para retornar o nome do funcionário com maior salário
	public String obterFuncionarioMaiorSalario() {
		if (indice > 0) {
			Funcionario funcionarioMaiorSalario = listaFuncionarios[0];
			for (int i = 1; i < indice; i++) {
				if (listaFuncionarios[i].getSalario() > funcionarioMaiorSalario.getSalario()) {
					funcionarioMaiorSalario = listaFuncionarios[i];
				}
			}
			return funcionarioMaiorSalario.getNome();
		} else {
			return null;
		}
	}
	// método para retornar todos os funcionários de determinado departamento
	public String mostrarDepartamento(int departamento) {
		String str = "";
		System.out.println("Funcionários em determinado departamento: ");
		for (Funcionario f : listaFuncionarios) {
			if (departamento == f.getDepartamento()) {
				str += "\n" + f.getNome();
			}
		}
		if (str.equals("")) {
			return "Não existe funcionários neste determinado apartamento";
		}
		return str;
	}
		
	// método para retornar todos os funcionários com determinada função
	public String mostrarFuncao(String funcao) {
		String str = "";
		System.out.println("\nFuncionários com determinada função: ");
		for (Funcionario f : listaFuncionarios) {
			if (funcao.equals(f.getFuncao())) {
				str += "\n" + f.getNome();
			}
		}
		if (str.equals("")) {
			return "Não existe funcionários com esta função";
		}
		return str;
	}
	//método para imprimir a folha de pagamento ordenada
	public void imprimirFolhadePagamentoOrdenada() {
		Funcionario[] copialista = Arrays.copyOf(listaFuncionarios, indice);
		
        Arrays.sort(copialista, (f1, f2) -> Float.compare(f1.getSalario(), f2.getSalario()));
        
       System.out.println("\nFolha de Pagamento(Ordem Crescente)");
       for(Funcionario funcionario : copialista) {
    	   System.out.println("Nome: " + funcionario.getNome() + 
    			   			  " - Salário: " + funcionario.getSalario());
       }
	}

}
