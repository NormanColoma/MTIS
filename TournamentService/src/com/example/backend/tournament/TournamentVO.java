package com.example.backend.tournament;

public class TournamentVO {
	
	private int id;
	private String name;
	private String info;
	private String startdata;
	private String enddata;
	private String sport;
	private int playing;
	
	public TournamentVO() {
		
		this.id = -1;
		this.name = "";
		this.info = "";
		this.startdata = "";
		this.enddata = "";
		this.sport = "";
		this.playing = 0;
	}
	
	public TournamentVO(int id, String name, String info, String startdata, String enddata, String sport, int playing) {
		
		this.id = id;
		this.name = name;
		this.info = info;
		this.startdata = startdata;
		this.enddata = enddata;
		this.sport = sport;
		this.playing = playing;
	}

	
	public void setId(int id) { this.id = id; }
	public void setName(String name) { this.name = name; }
	public void setInfo(String info) { this.info = info; }
	public void setStartData(String startdata) { this.startdata = startdata; }
	public void setEndData(String enddata) { this.enddata = enddata; }
	public void setSport(String sport) { this.sport = sport; }
	public void setPlaying(int playing) { this.playing = playing; }
	
	
	public int getId() { return this.id; }
	public String getName() { return this.name; }
	public String getInfo() { return this.info; }
	public String getStartData() { return this.startdata; }
	public String getEndData() { return this.enddata; }
	public String getSport() { return this.sport; }
	public int getPlaying() { return this.playing; }
}
