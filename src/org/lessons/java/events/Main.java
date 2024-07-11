package org.lessons.java.events;

import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
				
		//inizializzo lo scanner---------------------------------------------------
		Scanner scanner = new Scanner(System.in);
		//--------------------------------------------------------------------------
		
		//dichiaro le variabili per chiedere all'utente le informazioni--------------
		String title;
		Date date = null;
		int numberPeople = 0;
		int numberDismiss = 0;
		//--------------------------------------------------------------------------
		
		
		//sistema per chiedere all'utente di scrivere le varie variabili------------
		
		Date d = new Date();
		String s;

		System.out.println("Dimmi il titolo dell'evento?");
		title = scanner.nextLine();
		 // si procura la data sotto forma di una stringa nel formato SHORT
        System.out.println("Inserisci la data [gg/mm/yyyy]: ");
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

		//----------------------------------------------------------------------------
        
        //---------------------------------------------------------------------------
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = d;
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
        
		
		//verifico cosa vuole fare l'utente se prenotare o cancellare prenotazione
		int peopleBook;
		int peopleDismiss;
		int seatsBook = 0;
		int seatsDismiss = 0;
			
		while(true && ok == true){
			System.out.println("cosa vuoi fare: 1 -> Prenotare, 2 -> Disdire, 3 -> Fine ?");
			int action = scanner.nextInt();
				
			if(action == 3) {
				break;
			}
			
			switch(action) {
				case 1:
					System.out.println("Quante persone ci saranno?");
					peopleBook = scanner.nextShort();
					seatsBook = seatsBook + peopleBook;
					break;
			
				case 2:
					if(seatsBook > 0) {
						System.out.println("Quante persone disdicono?");
						peopleDismiss = scanner.nextShort();
						if(peopleDismiss <= seatsBook) {
							seatsDismiss = seatsDismiss + peopleDismiss;
						}else {
							System.out.println("Non puoi puoi disdire piu posti di quelli prenotati");
						}
					}else {
						System.out.println("Non ci sono prenotazioni non puoi disdire!");	
					}
					break;
				}
			}

		//-------------------------------------------------------------------------
		
		//------Calcolo dei posti prenotati----------------------------------------
		numberPeople = seatsBook - seatsDismiss;
		//-------------------------------------------------------------------------
		 
		LocalDateTime date3 = LocalDateTime.now();
	    DateTimeFormatter myFormatObj  = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    String formattedDate = date3.format(myFormatObj );
		
		//-------------dichiaro l'oggetto evento-----------------------------------
		
		Evento events = new Evento(title, date, 100, numberPeople);
		
		Concerto concert = new Concerto(title, date, 100, numberPeople, formattedDate , 100.0F);
		
		//------------------------------------------------------------------------
		

		//-----------------------------------------------------------------------
		
		int totalSeats = events.getTotalSeats();
		int remainSeats = totalSeats - seatsBook + seatsDismiss;
		
		//-----------------------------------------------------------------------
		
		
		//stampo in console il risultato di quello che l'utente ha scritto
		System.out.println("-------Evento--------");
		System.out.println(events.getTitle());			
		System.out.println(events.getDate());			
		System.out.println("questi sono i posti totali: " + events.getTotalSeats());
		System.out.println("questi sono i posti prenotati: " + events.getBookedSeats());
		System.out.println("questi sono i posti che rimangono: " + remainSeats);
		System.out.println("---------------------");
		
		
		System.out.println("-------Evento--------");
		System.out.println(concert.hourPriceTitleFormatted());
		System.out.println(concert.hourPriceTitleFormatted2());
		System.out.println("---------------------");
		//-----------------------------------------------------------------
		
	}
	
}
