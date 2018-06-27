package model;

import interfaces.Quebravel;
import interfaces.Retornavel;

public class GarrafaVidro extends Garrafa implements Retornavel, Quebravel {

	public Cacos quebrar() {
		return new Cacos();
	}	
	
	public void jogarFora() {
	}	
	
	public Garrafa retornar() {
		return new GarrafaVidro();
	
	}

}
