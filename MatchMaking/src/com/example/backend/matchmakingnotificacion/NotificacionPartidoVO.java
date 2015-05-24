package com.example.backend.matchmakingnotificacion;

public class NotificacionPartidoVO {
	
	private int id;
	private int equipo_notificado;
	private int equipo_rival;
	private int partido;
	private String notificacion;
	private int leida;
	
	public NotificacionPartidoVO() {
		
		this.id = -1;
		this.equipo_notificado = -1;
		this.equipo_rival = -1;
		this.partido = -1;
		this.notificacion = "";
		this.leida = 0;
	}
	
	public NotificacionPartidoVO(int id, int equipo_notificado, int equipo_rival, int partido, String notificacion, int leida) {
		
		this.id = id;
		this.equipo_notificado = equipo_notificado;
		this.equipo_rival = equipo_rival;
		this.partido = partido;
		this.notificacion = notificacion;
		this.leida = leida;
	}
	
	public void setId(int id) { this.id = id; }
	public void setEquipoNotificado(int equipo_notificado) { this.equipo_notificado = equipo_notificado; }
	public void setEquipoRival(int equipo_rival) { this.equipo_rival = equipo_rival; }
	public void setPartido(int partido) { this.partido = partido; }
	public void setNotificacion(String notificacion) { this.notificacion = notificacion; }
	public void setLeida(int leida) { this.leida = leida; }
	
	public int getId() { return this.id; }
	public int getEquipoNotificado() { return this.equipo_notificado; }
	public int getEquipoRival() { return this.equipo_rival; }
	public int getPartido() { return this.partido; }
	public String getNotificacion() { return this.notificacion; }
	public int getLeida() { return this.leida; }

}
