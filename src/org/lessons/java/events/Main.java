package org.lessons.java.events;

import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
				
		//inizializzo lo scanner-----------------
		Scanner scanner = new Scanner(System.in);
		//---------------------------------------
		
		//dichiaro le variabili per chiedere all'utente le informazioni
		String title;
		Date date = null;
		int numberPeople = 0;
		int numberDismiss = 0;
		//-------------------------------------------------------------
		
		
		//sistema per chiedere all'utente di scrivere le varie variabili
		
		// Date d = new Date();
		String s;

		System.out.println("Dimmi il titolo dell'evento?");
		title = scanner.nextLine();
		 // si procura la data sotto forma di una stringa nel formato SHORT
        System.out.println("Inserisci la data [mm/gg/yyyy]: ");
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        // converte la stringa della data in un oggetto di classe Date
        try {
            DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT);
            // imposta che i calcoli di conversione della data siano rigorosi
            formatoData.setLenient(false);
            date = formatoData.parse(s);
        } catch (ParseException e) {
            System.out.println("Formato data non valido.");
        }

		//---------------------------------------------------------------
        
        //---------------------------------------------------------------------------
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2024-07-08");
        Date date2 = date;
        boolean ok = false ;
        
        int result = date1.compareTo(date2);
        
        if (result == 0) {
            ok = true;
        } else if (result < 0) {
        	ok = true;
        } else if (result > 0) {
            System.out.println("la data non va bene");
            ok = false;
        }
        
        //--------------------------------------------------------------------------
        
        
		//-----variabili di appoggio per verifica cosa vuole fare l'utente-------
		
		String firstAction = "prenota";
		String secondAction = "disdici";
		String endAction ="fine";
		
		//-----------------------------------------------------------------------
		
		//verifico cosa vuole fare l'utente se prenotare o cancellare prenotazione
		int i = 0;
		String action;
		int peopleBook;
		int peopleDismiss;
		int seatsBook = 0;
		int seatsDismiss = 0;
			
		while(i != 1 && ok == true){
			System.out.println("prenota, disidici o fine?");
			action = scanner.nextLine();
			
				if(action.compareToIgnoreCase(firstAction) == 0) {
					System.out.println("Quante persone ci saranno?");
					peopleBook = scanner.nextShort();
					seatsBook = seatsBook + peopleBook;
				}else if(action.compareToIgnoreCase(secondAction) == 0) {
					System.out.println("Quante persone ci disdicono?");
					peopleDismiss = scanner.nextShort();
			        seatsDismiss = seatsDismiss + peopleDismiss;
				}else if(action.compareToIgnoreCase(endAction) == 0) {
					System.out.println("si");
					i = 1;
					
					//break;
				}
				
		}
		//------------------------------------------------------------------------
		
		numberPeople = seatsBook - seatsDismiss;
		
	
		//dichiaro l'oggetto evento---------------------------------------
		
		Evento events = new Evento(title, date, 100, numberPeople);
		
		//-----------------------------------------------------------------------
		
		
		
		
		//-----------------------------------------------------------------------
		int totalSeats = events.getTotalSeats();
		int remainSeats = totalSeats;
		if(seatsBook == 0) {
			remainSeats = totalSeats - seatsBook;
		}
		
		
		//-----------------------------------------------------------------------
		
		
		//stampo in console il risultato di quello che l'utente ha scritto
		System.out.println("-------Evento--------");
		System.out.println(events.getTitle());			
		System.out.println(events.getDate());			
		System.out.println(events.getBookedSeats());
		System.out.println(events.getTotalSeats());
		System.out.println(remainSeats);
		System.out.println("-----Fine Evento-----");
		//-----------------------------------------------------------------
		
	}
	
}
