package Capteur;

import java.util.ArrayList;
import java.util.Set;

import Afficheur.Observer;
import Afficheur.ObserverAsync;
import Strategies.*;
import Types.IntegerGType;



public class CapteurImpl implements Capteur<ObserverAsync<Capteur>> {

	private ArrayList<ObserverAsync<Capteur>> listObs;
	private int value;
	boolean locked;
	private Strategy strategy;

	public CapteurImpl(Type_Strategy type_strat) {
		this.listObs = new ArrayList<ObserverAsync<Capteur>>();
		this.locked = false;
		this.value = 0 ;
		
		
		switch(type_strat) {
			case ATOMIQUE :
				this.strategy = new Strategy_Atomique();
				break;
			case SEQUENTIELLE :
				this.strategy = new Strategy_Sequentielle();
				break;
			case EPOQUE :
				this.strategy = new Strategy_Epoque();
				break;
		}
			strategy.configure(this);	
	}

	@Override
	public void attach(ObserverAsync<Capteur> o) {
		listObs.add(o);
	}

	@Override
	public void detach(ObserverAsync<Capteur> o) {
		listObs.remove(o);
	}



	@Override
	public void tick() {
		
		this.value++;
		System.out.println("Tick : " + this.value);
		this.strategy.execute();

	}

	@Override
	public boolean isLocked() {
		return locked;
	}

	@Override
	public void lock() {
		locked = true;
	}

	@Override
	public void unlock() {
		locked = false;
	}

	

	@Override
	public int getValue() {
		return this.value;
	}

	@Override
	public ArrayList<ObserverAsync<Capteur>> getObservers() {
		
		return listObs;
	}

	
	
	





}
