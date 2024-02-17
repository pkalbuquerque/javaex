package exercicio06;


public class TestePessoa {

	public TestePessoa() {
		Pessoa p1 = new Pessoa("Luciana");
		
		p1.addEndereco(new Endereco("Rua Antônio da Veiga"));
		
		Endereco e1 = new Endereco("Rua XV de novembro");
		e1.setNumero(2040);
		p1.addEndereco(e1);
		
		Endereco e2 = new Endereco("Rua São Paulo");
		e2.setComplemento("Em frente ao giassi");
		p1.addEndereco(e2);
		
		Endereco e3 = new Endereco("Rua Joinville");
		e3.setNumero(1002);
		e3.setComplemento("Apto 10");
		p1.addEndereco(e3);
		
		System.out.println(p1.imprimirEnderecos());
		
	}
	
	public static void main(String[] args) {
		new TestePessoa();
	}
}

