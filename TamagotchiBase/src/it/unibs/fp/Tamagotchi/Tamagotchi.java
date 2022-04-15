package it.unibs.fp.Tamagotchi;

public class Tamagotchi 
{
	private static final String TAMA_VIVO = "Il tamagotchi sta bene";
	private static final String TAMA_MORTO = "Tamagotchi morto";
	private static final String UMORE_TRISTE = "Sono triste";
	private static final String UMORE_FELICE = "Sono felice";
	
	private int soddisfazione, sazieta;
	private String nome, umore;
	private Boolean morte, triste;
	
	
	public Tamagotchi(String _nome, int _soddisfazione, int _sazieta) {
		//super();
		this.soddisfazione = _soddisfazione;
		this.sazieta = _sazieta;
		this.nome = _nome;
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
		return sazieta;
	}

	public void setSazietà(int sazietà) {
		this.sazieta = sazietà;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getInfo() {
		if (soddisfazione <= 30 || sazieta <= 30) {
			umore = UMORE_TRISTE;
		} else {
			umore = UMORE_FELICE;
		}
		return ( "-Nome: " + nome + "\n" + "-Soddisfazione: " + soddisfazione + "\n" + "-Sazietà: " + sazieta + "\n" + "-Stato: " + umore);
	}
	
	// METODO PER STABILIRE LA MORTE
	public Boolean sonoMorto() {
		if(soddisfazione == 0 || sazieta == 0 || sazieta >= 100) {
			morte = true;
			System.out.println(TAMA_MORTO);
	    } else {
			morte = false;
			System.out.println(TAMA_VIVO);
	      }
		return morte;
	}
	
	// METODO PER STABILIRE LA TRISTEZZA O MENO DEL TAMAGOTCHI
	public Boolean sonoTriste() {
		if (soddisfazione <= 30 || sazieta <= 30 || soddisfazione >= 95 || sazieta >= 95) {
			triste = true;
			umore = UMORE_TRISTE;
			System.out.println(umore);
		} else {
			triste = false;
			umore = UMORE_FELICE;
		 }
		return triste;
	}
	
	
	public void riceviCarezze (int numCarezze) {
		soddisfazione = soddisfazione + numCarezze;
		soddisfazione = Math.min(100, soddisfazione);
		sazieta = Math.max(0, sazieta - 10);
	}
	
    public void riceviBiscotti (int numBiscotti) {
		sazieta = sazieta + numBiscotti;
		sazieta = Math.min(100, sazieta);
		soddisfazione = Math.max(0, soddisfazione - 10);
	}
}
