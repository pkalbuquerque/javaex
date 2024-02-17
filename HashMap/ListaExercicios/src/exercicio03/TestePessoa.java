package exercicio03;

import java.util.HashMap;

public class TestePessoa {
	private HashMap<Integer, Pessoa> listapessoas;
	
	public TestePessoa(){ 
	listapessoas = 	new HashMap<Integer, Pessoa>();
	Pessoa pessoa1 = new Pessoa("João", 123);
    Pessoa pessoa2 = new Pessoa("Maria", 987);
    Pessoa pessoa3 = new Pessoa("Pedro", 456);
	
    inserir(123, pessoa1, listapessoas);
    inserir(987, pessoa2, listapessoas);
    inserir(456, pessoa3, listapessoas);
	
	System.out.println(toString());
	
	}
	public void inserir(int cpf, Pessoa p, HashMap<Integer, Pessoa> listapessoas) { 
		listapessoas.put(cpf, p);
	}
	public String toString() {
		String dados = "";
		for(Pessoa p : listapessoas.values()) {
			dados += p.getNome() + " (" + p.getCpf() + ")\n";
		}
		return dados;
	}
	public static void main(String[] args) {
		new TestePessoa();
	}
}
