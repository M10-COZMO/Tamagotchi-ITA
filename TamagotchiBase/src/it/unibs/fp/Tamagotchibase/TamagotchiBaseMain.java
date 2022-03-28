package it.unibs.fp.Tamagotchibase;

import java.util.Scanner;
import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;
	
public class TamagotchiBaseMain {
	
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
		//int valoreSoddisfazione, valoreSazietà;
		int soddisfazione, sazietà;
		int daiCarezze, daiBiscotti;
		int scelta = 0;
		String tamagotchiName, umore;
		String [] voci = {"Dai carezze", "Dai Biscotto"};
		
		
		//CREAZIONE DEL PROPRIO TAMAGOTCHI
		System.out.println(SALUTO);
		System.out.println(RICHIEDI_NOME);
		tamagotchiName = input.nextLine();
		System.out.println(RICHIEDI_VALORI_INIZIALI);
		//valoreSoddisfazione = InputDati.leggiIntero(RICHIEDI_SODDISFAZIONE, 0, 100);
		//valoreSazietà = InputDati.leggiIntero(RICHIEDI_SAZIETA, 0, 100);
		soddisfazione = InputDati.leggiIntero(RICHIEDI_SODDISFAZIONE, 0, 100);
		sazietà = InputDati.leggiIntero(RICHIEDI_SAZIETA, 0, 100);
		
		//ASSEGNAZIONE DELLE CLASSI
		//Interazione soddisfazione = new Interazione(valoreSoddisfazione);
		//Interazione sazietà = new Interazione(valoreSazietà);
		if (soddisfazione <= 30 || sazietà <= 30) {
			umore = ("Triste");
		} else {
			umore = ("Felice");
		}
		Tamagotchi pet = new Tamagotchi(soddisfazione, sazietà, tamagotchiName, umore);
		
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
				pet.daiCarezze(daiCarezze);
				//soddisfazione.incrementoValore(daiCarezze);
				//sazietà.decrementoValore(10);
				System.out.println(pet.getInfo());
				break;
				
			case 2: //BISCOTTI
				daiBiscotti = InputDati.leggiIntero(RICHIEDI_BISCOTTI, 0, 20);
				pet.daiBiscotti(daiBiscotti);
				//sazietà.incrementoValore(daiBiscotti);
				//soddisfazione.decrementoValore(10);
				System.out.println(pet.getInfo());
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
