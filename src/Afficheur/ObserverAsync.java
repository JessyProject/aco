package Afficheur;

import java.util.concurrent.Future;

import Subject.Subject;

public interface ObserverAsync<T>{

	public Future<Void> update (T capteur);
	
	
}