package Strategies;

import java.util.ArrayList;

import Capteur.Canal;
import Capteur.Capteur;

public abstract class Strategy_Abstract implements Strategy{
	
	Capteur capteur;
	ArrayList<Canal> canaux = new ArrayList<>();
	
	
	@Override
	public void configure(Capteur capteur) {
		this.capteur = capteur;
	}
	
	

	@Override
    public int getValue() {
        return capteur.getValue();
    }
	
	@Override
	public void addCanal(Canal canal) {
		this.canaux.add(canal);
	}



}
