package it.unibs.fp.Tamagotchibase;

public class Interazione {
	
	private int valore;

	public Interazione(int _valore) {
		//super();
		this.valore = _valore;
	}

	public int getValore() {
		return valore;
	}

	public void setValore(int _valore) {
		this.valore = _valore;
	}
	
	public void incrementoValore(int incremento) {
		valore = valore + incremento;
	}
	public void decrementoValore(int decremento) {
		valore = valore - decremento;
	}
}
