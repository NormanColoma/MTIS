package com.example.db;


public class RespuestaDBUpdate {
	
	private boolean resultado;
	private int id_updated;
	private boolean error;
	private String error_text;
	
	public RespuestaDBUpdate() {
		
		this.resultado = false;
		this.id_updated = -1;
		this.error = false;
		this.error_text = "";
	}
	
	public void setResultado(boolean resultado) { this.resultado = resultado; }
	public void setIDActualizada(int id) { this.id_updated = id; }
	public void setError(boolean error) { this.error = error; }
	public void setMensajeError(String error) { this.error_text = error; }
	
	public boolean getResultado() { return this.resultado; }
	public int getIDActualizada() { return this.id_updated; }
	public boolean isError() { return this.error; }
	public String getMensajeError() { return this.error_text; }
	
}
