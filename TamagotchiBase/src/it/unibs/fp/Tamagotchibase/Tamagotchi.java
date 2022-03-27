package it.unibs.fp.Tamagotchibase;

public class Tamagotchi 
{
	private int soddisfazione, sazietà;
	private String nome;
	
	
	public Tamagotchi(int _soddisfazione, int _sazietà, String _nome) {
		//super();
		this.soddisfazione = _soddisfazione;
		this.sazietà = _sazietà;
		this.nome = _nome;
	}

	public int getSoddisfazione() {
		return soddisfazione;
	}

	public void setSoddisfazione(int soddisfazione) {
		this.soddisfazione = soddisfazione;
	}

	public int getSazietà() {
		return sazietà;
	}

	public void setSazietà(int sazietà) {
		this.sazietà = sazietà;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getInfo(int soddisfazione, int sazietà, String nome) {
		return ( "-Nome: " + nome + "\n" + "-Soddisfazione: " + soddisfazione + "\n" + "-Sazietà: " + sazietà);
	}
	
	public void daiCarezze (int numCarezze) {
		soddisfazione = soddisfazione + numCarezze;
		soddisfazione = Math.min(100, soddisfazione);
		sazietà = Math.max(0, sazietà - 10);
	}
    public void daiBiscotti (int numBiscotti) {
		sazietà = sazietà + numBiscotti;
		sazietà = Math.min(100, sazietà);
		soddisfazione = Math.max(0, soddisfazione - 10);
	}
}
