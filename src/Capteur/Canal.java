package Capteur;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import Afficheur.Afficheur;
import Afficheur.Observer;
import Afficheur.ObserverAsync;
import Afficheur.ObserverDeCapteur;
import Subject.Subject;
import Subject.SubjectAsync;
import Types.IntegerGType;



public class Canal implements CapteurAsync, ObserverAsync<Capteur>{

	private String nameCanal ;
	private ScheduledExecutorService scheduler;
	private Capteur<IntegerGType> capteur;
	private Afficheur afficheur;
	private List<ObserverDeCapteur<CapteurAsync>> listObs  = new ArrayList<ObserverDeCapteur<CapteurAsync>>();
	
	
	private final static int DELAY_MAX = 500;
	private final static int DELAY_MIN = 3000;
	private final static int SIZE = 4;

	
	public Canal(String nameCanal, Capteur capteur, Afficheur affich) {
		this.nameCanal = nameCanal ;
		this.capteur = capteur;
		
		scheduler = Executors.newScheduledThreadPool(SIZE);
		afficheur = affich;

	}





	@Override
	public Future<Void> update(Capteur capteur) {
		
		int delay = (int) (DELAY_MIN + (Math.random() * (DELAY_MAX - DELAY_MIN)));
		return (Future<Void>) scheduler.schedule(() -> {afficheur.update(this);}, delay , TimeUnit.MILLISECONDS);
 
	}


	@Override
	public Future<Integer> getValue() {
		int delay = (int) (DELAY_MIN + (Math.random() * (DELAY_MAX - DELAY_MIN)));
		
		return scheduler.schedule(() -> {
            	return ( this.capteur.getValue());   
		}, delay, TimeUnit.MILLISECONDS);
	}


	public String getNameCanal() {
		return nameCanal;
	}
















	




	

    
    
	
	
}
