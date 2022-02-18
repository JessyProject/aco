package Strategies;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;

import Capteur.Canal;
import Capteur.Capteur;

public class Strategy_Sequentielle extends Strategy_Abstract{



	@Override
	public void execute() {
		int value = capteur.getValue();
		System.out.println(capteur + " diffuse " + value);
		Canal canal =(Canal) capteur.getObservers().iterator().next();
		//canal.setHold(true);
		// if (valeurRecueParToutAfficheur()) {
		// 	canal.updateHold();
		// 	for (ObserverAsync canal2 : capteur.getObservers()) {
		// 		diffusionCourante.add(canal2.update(capteur));
		// 	}
		// }
	}
	
	// /***
	//  * 
	//  * @return true si la valeur à été reçue par tous las afficheurs
	//  */
	// private boolean valeurRecueParToutAfficheur() {
	// 	boolean res = true;
	// 	for (Future<?> f : diffusionCourante) {
	// 		if (!f.isDone()) {
	// 			return false;
	// 		}
	// 	}
	// 	if (res) {
	// 		diffusionCourante = new HashSet<>();
	// 	}
	// 	return res;
	// }


	
}
