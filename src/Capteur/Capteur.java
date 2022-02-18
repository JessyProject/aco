package Capteur;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;

import Afficheur.Observer;
import Afficheur.ObserverAsync;
import Subject.Subject;
import Types.IntegerGType;

public interface Capteur<T> extends Subject<T> {

	public int getValue();

	public void tick();
	
	public boolean isLocked();

	public void lock();
	
	public void unlock();

	public ArrayList<ObserverAsync<Capteur>> getObservers();

}