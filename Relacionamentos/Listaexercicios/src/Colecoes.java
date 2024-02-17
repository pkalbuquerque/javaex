import java.util.ArrayList;

public class Colecoes {
	public static void main(String[] args) {
		
		ArrayList<String> itens = new ArrayList<>();
		
		itens.add("Escapamento");
		itens.add("Teto Solar");
		
		itens.remove(0);
		
		for (String string : itens) {
			System.out.println(string);
		}
	}
}	
