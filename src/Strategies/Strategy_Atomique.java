package Strategies;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import Afficheur.Observer;
import Afficheur.ObserverAsync;
import Capteur.Canal;
import Capteur.Capteur;
import Capteur.CapteurImpl;
import Types.IntegerGType;

public class Strategy_Atomique extends Strategy_Abstract{

	 private ArrayList<Future<Void>> listFuture = new ArrayList<>();
	 
	 
	 @Override
		public void execute() {
			int value = this.capteur.getValue();
			System.out.println("Capteur diffuse " + value);
			if (valeurRecueParToutAfficheur()) {
				for (ObserverAsync canal : this.canaux) {
					listFuture.add(canal.update(capteur));
				}
				for(Future<?> f : listFuture) {
					try {
						f.get();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (ExecutionException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		
		/***
		 * 
		 * @return true si la valeur à été reçue par tous las afficheurs
		 */
		private boolean valeurRecueParToutAfficheur() {
			boolean res = true;
			for (Future<?> f : listFuture) {
				res &= f.isDone();
			}
			if (res) {
				listFuture = new ArrayList<>();
			}
			return res;
		}

	}
