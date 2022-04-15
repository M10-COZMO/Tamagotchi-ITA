package it.unibs.fp.Tamagotchi;

import java.util.Scanner;
import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;
	
public class TamagotchiMain {
	
	private static final String GAME_OVER = "GAME OVER";
	private static final String RICHIEDI_SODDISFAZIONE = "Inserisci valore soddisfazione: ";
	private static final String RICHIEDI_SAZIETA = "Inserisci valore sazietà: ";
	private static final String RICHIEDI_BISCOTTI = "Inserire valore biscotti: ";
	private static final String RICHIEDI_CAREZZE = "Inserire valore carezze: ";
	private static final String TITOLO_MENU = "Scegliere l'opzione";
	private static final String PRESENTAZIONE_TAMAGOTCHI = "Complimenti, ecco il tuo tamagotchi: ";
	private static final String RICHIEDI_VALORI_INIZIALI = "Ora inserisci i valore iniziali di soddisfazione e sazietà.\nATTENZIONE! i valore scelto deve essere compreso tra 0 e 100. ";
	private static final String RICHIEDI_NOME = "Inserisci il nome del tuo tamagotchi: ";
	private static final String SALUTO = "Buongiorno! Crea il tuo personale tamagotchi...";
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int soddisfazione, sazieta;
		int daiCarezze, daiBiscotti;
		int scelta = 0;
		String tamagotchiName;
		String [] voci = {"Dai carezze", "Dai Biscotto"};
		
		
		//CREAZIONE DEL PROPRIO TAMAGOTCHI
		System.out.println(SALUTO);
		System.out.println(RICHIEDI_NOME);
		tamagotchiName = input.nextLine();
		System.out.println(RICHIEDI_VALORI_INIZIALI);
		soddisfazione = InputDati.leggiIntero(RICHIEDI_SODDISFAZIONE, 0, 100);
		sazieta = InputDati.leggiIntero(RICHIEDI_SAZIETA, 0, 100);
		
		//ASSEGNAZIONE DELLA CLASSE TAMAGOTCHI
		Tamagotchi pet = new Tamagotchi(tamagotchiName, soddisfazione, sazieta);
		
		//PRESENTAZIONE TAMAGOTCHI
		System.out.println(PRESENTAZIONE_TAMAGOTCHI);
		System.out.println(pet.getInfo());
		
		//MENU E SCELTA CAREZZE O BISCOTTI
		MyMenu menu = new MyMenu (TITOLO_MENU, voci);
		do 
		{
			scelta = menu.scegli();
			
			switch (scelta) 
			{
			case 1: //CAREZZE
				daiCarezze = InputDati.leggiIntero(RICHIEDI_CAREZZE, 0, 20);
				pet.riceviCarezze(daiCarezze);
				System.out.println(pet.getInfo());
				if (pet.sonoMorto()) {
					scelta = 0;
				}
				break;
				
			case 2: //BISCOTTI
				daiBiscotti = InputDati.leggiIntero(RICHIEDI_BISCOTTI, 0, 20);
				pet.riceviBiscotti(daiBiscotti);
				System.out.println(pet.getInfo());
				if (pet.sonoMorto()) {
					scelta = 0;
				}
				break;
			default:
				break;
			}
		} while (scelta != 0);
		
		if (scelta == 0) {
			System.out.println(GAME_OVER);
		}
	}
}
