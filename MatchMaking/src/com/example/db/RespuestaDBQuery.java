package com.example.db;

import java.sql.ResultSet;

public class RespuestaDBQuery {
	
	private ResultSet resultado;
	private boolean error;
	private String error_text;
	
	public RespuestaDBQuery() {
		
		this.resultado = null;
		this.error = false;
		this.error_text = "";
	}
	
	public void setResultado(ResultSet resultado) { this.resultado = resultado; }
	public void setError(boolean error) { this.error = error; }
	public void setMensajeError(String error) { this.error_text = error; }
	
	public ResultSet getResultado() { return this.resultado; }
	public boolean isError() { return this.error; }
	public String getMensajeError() { return this.error_text; }
	
}
