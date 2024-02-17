package exercicio05;

//Pedro Albuquerque e Diogo Pereira

public class Teste {

	public Teste(){
		 // Crie alguns objetos de Funcionario
        Funcionario funcionario1 = new Funcionario(1, "João", 1, 5000, "Analista");
        Funcionario funcionario2 = new Funcionario(2, "Maria", 2, 6000, "Gerente");
        Funcionario funcionario3 = new Funcionario(3, "Pedro", 1, 5500, "Analista");

        // Crie um objeto SetorPessoal com capacidade para 3 funcionários
        SetorPessoal setorPessoal = new SetorPessoal(3);

        // Adicione os funcionários ao SetorPessoal
        setorPessoal.adicionarFuncionario(funcionario1);
        setorPessoal.adicionarFuncionario(funcionario2);
        setorPessoal.adicionarFuncionario(funcionario3);
        // Imprima a folha de pagamento
        setorPessoal.imprimirFolhaPagamento();

        System.out.println();

        // Calcule o total da folha de pagamento
        double totalFolhaPagamento = setorPessoal.calcularTotalFolhaPagamento();
        System.out.println("Total da Folha de Pagamento: " + totalFolhaPagamento);

        // Encontre o funcionário com o maior salário
        String funcionarioMaiorSalario = setorPessoal.obterFuncionarioMaiorSalario();
        System.out.println("Funcionário com Maior Salário: " + funcionarioMaiorSalario);

        // Encontre os funcionários em um determinado departamento
        String funcionariosDepartamento1 = setorPessoal.mostrarDepartamento(1);
        System.out.println(funcionariosDepartamento1);

        // Encontre os funcionários com uma determinada função
        String funcionariosAnalista = setorPessoal.mostrarFuncao("Analista");
        System.out.println(funcionariosAnalista);

        // Imprima a folha de pagamento ordenada
        setorPessoal.imprimirFolhadePagamentoOrdenada();
	}
	public static void main(String[] args) {
		new Teste();
	}
}
