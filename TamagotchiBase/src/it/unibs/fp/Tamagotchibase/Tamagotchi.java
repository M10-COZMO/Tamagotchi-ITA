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
	
	public String getInfo() {
		return ( "-Nome: " + nome + "-Soddisfazione: " + soddisfazione + "-Sazietà: " + sazietà);
	}
	
	public void daiCarezze (int carezze) {
		
	}
    public void daiBiscotti (int biscotti) {
		
	}
}
