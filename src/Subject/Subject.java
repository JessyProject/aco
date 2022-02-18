package Subject;

import Afficheur.Observer;
import Afficheur.ObserverAsync;
import Capteur.Capteur;

public interface Subject<T> {

	
	public void attach(T o);

	public void detach(T o);

   
}