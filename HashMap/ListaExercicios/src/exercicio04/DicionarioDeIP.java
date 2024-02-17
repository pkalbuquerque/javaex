/**
 * @author Pedro K. Albuquerque;
 */


package exercicio04;
import java.util.HashMap;


public class DicionarioDeIP {
	private HashMap<String, Site> mapaSites;
	
	public DicionarioDeIP() {
		Site site1 = new Site("www.inf.furb.br", "201.54.201.5", true);
		Site site2 = new Site("www.invest.com", "77777777", false);
		
		 mapaSites = new HashMap<String, Site>();
		
		inserir(mapaSites, site1);
		inserir(mapaSites, site2);
		
		System.out.println(acessarSite("www.inf.furb.br", mapaSites));
		System.out.println(acessarSite("www.invest.com", mapaSites));
		
		System.out.println(imprimirSite());
	}
	public boolean inserir(HashMap<String, Site> mapaSites, Site site) {
		if (mapaSites.containsKey(site.getNome())) {
			return false;
		}
		mapaSites.put(site.getNome(), site);
		return true;
	}
	public String acessarSite(String nome, HashMap<String, Site> mapaSites) {
		for (Site site : mapaSites.values()) {
			if (nome.equals(site.getNome())) {
				if (site.getAcesso() == true) {
					return "Site: " + site.getNome() + 
							"\nIP: " + site.getEnderecoip();
				}
				return "Site Bloqueado";
			}
		}
		return "Site não encontrado.";
	}
	public String imprimirSite() {
		String dados = "";
		for(Site site : mapaSites.values()) {
			dados += site.toString() + "\n";
		}
		return dados;
	}
	
	public static void main(String[] args) {
		new DicionarioDeIP();
	}
}
