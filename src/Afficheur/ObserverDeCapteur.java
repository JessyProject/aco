package Afficheur;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import Capteur.Canal;
import Subject.Subject;

public interface ObserverDeCapteur<T> {

	public void update(T subject);

}