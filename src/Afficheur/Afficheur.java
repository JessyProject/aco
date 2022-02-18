package Afficheur;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import Capteur.Canal;
import Capteur.Capteur;
import Capteur.CapteurAsync;
import Subject.Subject;

public class Afficheur implements ObserverDeCapteur<CapteurAsync> {

    private String nomAfficheur;
    private Set<Integer> values;


    public Afficheur(String nomAfficheur) {
        this.nomAfficheur = nomAfficheur;
        values = new HashSet<Integer>();

    }


	@Override
	public void update(CapteurAsync capteur){
		
		Future<Integer> future = (Future<Integer>) capteur.getValue();
		try {
			Integer value = future.get();
			System.out.println("Afficheur : "+ this.nomAfficheur +", valeur : "+ value);
			this.values.add(value);
		} catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
		
        //return null;
    }


	public String getNomAfficheur() {
		return nomAfficheur;
	}


	public Set<Integer> getValues() {
		return values;
	}



	
	

	


	


	


	


	
}
