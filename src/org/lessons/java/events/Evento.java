package org.lessons.java.events;

import java.util.Date;

public class Evento {
	
	private String title;
	private Date date;
	private int totalSeats;
	private int bookedSeats = 0;
	
	public Evento (String title, Date date, int totalSeats, int bookedSeats) {
		
		this.title = title;
		this.date = date;
		this.totalSeats = totalSeats;
		this.bookedSeats = bookedSeats;
		
	}
	
	
	// -------------Method get-------------------------
		
	public String  getTitle() {
		return this.title;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public int getTotalSeats() {
		return this.totalSeats;
	}
	
	public int getBookedSeats() {
		return this.bookedSeats;
	}
	
	
	//-------------------------------------------------

	// -------------Method set-------------------------
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	//-------------------------------------------------
	
}
