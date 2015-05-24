package com.example.backend.matchmaking;

public class GameVO {

	private int id;
	private String date;
	private int confirmed;
	private int sportCenter;
	private String sport;
	
	public GameVO() {
		
		this.id = -1;
		this.date = "";
		this.confirmed = 0;
		this.sportCenter = -1;
		this.sport = "";
	}
	
	public GameVO(int id, String date, int confirmed, int sportCenter, String sport) {
		
		this.id = id;
		this.date = date;
		this.confirmed = confirmed;
		this.sportCenter = sportCenter;
		this.sport = sport;
	}
	
	
	public void setId(int id) { this.id = id; }
	public void setDate(String date) { this.date = date; }
	public void setConfirmed(int confirmed) { this.confirmed = confirmed; }
	public void setSportCenter(int sportCenter) { this.sportCenter = sportCenter; }
	public void setSport(String sport) { this.sport = sport; }
	
	public int getId() { return this.id; }
	public String getDate() { return this.date; }
	public int getConfirmed() { return this.confirmed; }
	public int getSportCenter() { return this.sportCenter; }
	public String getSport() { return this.sport; }
}
