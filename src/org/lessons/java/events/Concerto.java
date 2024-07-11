package org.lessons.java.events;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Concerto extends Evento {
	
	private String hour;
	private Float price;
	private String title;
	private Date date;

	public Concerto(String title, Date date, int totalSeats, int bookedSeats, String hour, Float price) {
		super(title, date, totalSeats, bookedSeats);
		// TODO Auto-generated constructor stub
		this.hour = hour;
		this.price = price;
		this.title = title;
		this.date = date;
	}

	//-------------Method set-------------------------
	
	public void sethour(String hour) {
		this.hour = hour;
	}
	
	public void setprice(Float price) {
		this.price = price;
	}
	
	//-------------------------------------------------
	
	//-------------Method get-------------------------
	
	public String gethour() {
		return hour;
	}
	
	public Float getprice() {
		return price;
	}
	
	//-------------------------------------------------
	
	
	
	public String hourPriceTitleFormatted() {
		return hour + " " + price + "€" + " " + title;
	}
	
	public String hourPriceTitleFormatted2() {
		DateFormat formatoData = DateFormat.getDateInstance(DateFormat.LONG, Locale.ITALY);
		String s = formatoData.format(date);
		
		return s + " " + price + "€" + " " + title;
	}
}
