package exercicio04;

public class Site {
	private String nomesite;
	private String siteIP;
	private boolean statusacesso;
	
	public Site(String nomesite, String siteIP, boolean statusacesso) {
		setNomesite(nomesite);
		setSiteIP(siteIP);
		setStatusacesso(statusacesso);
	}
	
	public String getNomesite() {
		return nomesite;
	}
	public String getSiteIP() {
		return siteIP;
	}
	public void setNomesite(String nomesite) {
		this.nomesite = nomesite;
	}
	public void setSiteIP(String siteIP) {
		this.siteIP = siteIP;
	}
	public void setStatusacesso(boolean statusacesso) {
		this.statusacesso = statusacesso;
	}
	public boolean statusacesso() {
		return statusacesso;
	}
}
