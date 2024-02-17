package exercicio02;

public class Computador {
	private int numeroserial;
	private int hd;
	private int memoria;

	public Computador(int numeroserial, int hd, int memoria) {
		setNumeroserial(numeroserial);
		setHd(hd);
		setMemoria(memoria);
	}

	public int getHd() {
		return hd;
	}

	public int getMemoria() {
		return memoria;
	}

	public int getNumeroserial() {
		return numeroserial;
	}

	public void setHd(int hd) {
		this.hd = hd;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public void setNumeroserial(int numeroserial) {
		this.numeroserial = numeroserial;
	}
	public String toString() {
		return "\nNúmero Serial: : " + this.getNumeroserial() + 
				"\nCapacidade do HD: " + this.getHd();
 	}
}
