package org.lessons.java.events;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Concerto extends Evento {
	
	private String hour;
	private String price;
	private String title;

	public Concerto(String title, Date date, int totalSeats, int bookedSeats, String hour, String price) {
		super(title, date, totalSeats, bookedSeats);
		// TODO Auto-generated constructor stub
		this.hour = hour;
		this.price = price;
		this.title = title;
	}

	//-------------Method set-------------------------
	
	public void sethour(String hour) {
		this.hour = hour;
	}
	
	public void setprice(String price) {
		this.price = price;
	}
	
	//-------------------------------------------------
	
	//-------------Method get-------------------------
	
	public String gethour() {
		return hour;
	}
	
	public String getprice() {
		return price;
	}
	
	//-------------------------------------------------
	
	
	
	public String hourPriceTitleFormatted() {
		return hour + " " + price + "€" + " " + title;
	}
}
