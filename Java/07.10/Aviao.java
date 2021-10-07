package SegundoEX;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aviao {
	
	private int numPassagens;
	private String origem;
	private String destino;
	private String horaPartida;
	private String horaChegada;
	private String dataPartida;
	private String dataChegada;
	
	public Aviao(int numPassagens, String origem, String destino, String horaPartida, String horaChegada, String dataPartida,String dataChegada) {
		this.numPassagens=numPassagens;
		this.origem = origem;
		this.destino = destino;
		this.horaPartida = horaPartida;
		this.horaChegada = horaChegada;
		this.dataPartida= dataPartida;
		this.dataChegada = dataChegada;
		
	}

	public int getNumPassagens() {
		return numPassagens;
	}

	public void setNumPassagens(int numPassagens) {
		this.numPassagens = numPassagens;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getHoraPartida() {
		return horaPartida;
	}

	public void setHoraPartida(String horaPartida) {
		this.horaPartida = horaPartida;
	}

	public String getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}

	public String getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(String dataPartida) {
		this.dataPartida = dataPartida;
	}

	public String getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(String dataChegada) {
		this.dataChegada = dataChegada;
	}
	
	
	public String formatarData() {
		Date pt = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
		String data = formatar.format(pt);
		return data;
		
	}
	
	public String formatarHora() {
		Date hr = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("hh:mm");
		String hora = formatar.format(hr);
		return hora;
	}
	public void intinerario() {
		System.out.println("\nQuantidade de Passageiros: "+numPassagens
				+" Origem: "+origem+" Destino: "+destino
				+"\nHora de Partida: "+this.formatarHora()
				+"\nHora da Chegada: "+this.formatarHora()
				+"\nData de Partida: "+this.formatarData()
				+" Data de Chegada: "+this.formatarData());
	}
	
	
	
}
