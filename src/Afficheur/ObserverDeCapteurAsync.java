package Afficheur;
import java.util.concurrent.ExecutionException;

import Capteur.Canal;

public interface ObserverDeCapteurAsync {
	 
	public Void update(Canal subject) throws ExecutionException, InterruptedException;
}
