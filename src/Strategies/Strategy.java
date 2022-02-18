package Strategies;

import Capteur.Canal;
import Capteur.Capteur;

public interface Strategy {

	public void configure(Capteur capteur);
	
	public void execute();

	public int getValue();
	
	public void addCanal(Canal canal);
	
	
	
}
