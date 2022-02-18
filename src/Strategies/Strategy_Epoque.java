package Strategies;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import Afficheur.Observer;
import Capteur.Canal;
import Types.IntegerGType;

public class Strategy_Epoque extends Strategy_Abstract{

	@Override
	public void execute() {
		ArrayList<Canal> listCanaux = capteur.getObservers();
		for (Canal canal : listCanaux) {
			System.out.println("update canal : "+ canal.getNameCanal());
			canal.update(this.capteur);
		}

		
	}

	

}
