package org.lessons.java.events;

import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class utility {
	
	  
	   
	   public static void main(String []args) throws ParseException{
		   
		// Date d = new Date();
	        String s;
	        Date date = null;
	        // si procura la data sotto forma di una stringa nel formato SHORT
	        System.out.println("Inserisci la data [gg/mm/yyyy]: ");
	        Scanner in = new Scanner(System.in);
	        s = in.nextLine();
	        // converte la stringa della data in un oggetto di classe Date
	        try {
	            DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
	            // imposta che i calcoli di conversione della data siano rigorosi
	            formatoData.setLenient(false);
	            date = formatoData.parse(s);
	        } catch (ParseException e) {
	            System.out.println("Formato data non valido.");
	        }
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        Date date1 = sdf.parse("2024-07-08");
	        // Date date1 = d;
	        Date date2 = date;

	        int result = date1.compareTo(date2);
	        
	        if (result == 0) {
	            System.out.println("Date1 is equal to Date2");
	        } else if (result > 0) {
	            System.out.println("Date1 is after Date2");
	        } else if (result < 0) {
	            System.out.println("Date1 is before Date2");
	        } else {
	            System.out.println("How to get here?");
	        }
	    }
}
