package it.unibs.fp.Tamagotchi;

public class Tamagotchi 
{
	private int soddisfazione, sazietà;
	private String nome, umore;
	
	
	public Tamagotchi(int _soddisfazione, int _sazietà, String _nome, String _umore) {
		//super();
		this.soddisfazione = _soddisfazione;
		this.sazietà = _sazietà;
		this.nome = _nome;
		this.umore = _umore;
	}

	public String getUmore() {
		return umore;
	}

	public void setUmore(String umore) {
		this.umore = umore;
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
		return ( "-Nome: " + nome + "\n" + "-Soddisfazione: " + soddisfazione + "\n" + "-Sazietà: " + sazietà + "\n" + "-Stato: " + umore);
	}
	
	
	public void daiCarezze (int numCarezze) {
		soddisfazione = soddisfazione + numCarezze;
		soddisfazione = Math.min(100, soddisfazione);
		sazietà = Math.max(0, sazietà - 10);
		if (soddisfazione <= 30 || sazietà <= 30) {
			umore = ("Triste");
		} else {
			umore = ("Felice");
		}
	}
    public void daiBiscotti (int numBiscotti) {
		sazietà = sazietà + numBiscotti;
		sazietà = Math.min(100, sazietà);
		soddisfazione = Math.max(0, soddisfazione - 10);
		if (soddisfazione <= 30 || sazietà <= 30) {
			umore = ("Triste");
		} else {
			umore = ("Felice");
		}
	}
}
