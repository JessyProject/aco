package Capteur;
import java.util.concurrent.Future;

import Afficheur.Observer;
import Types.IntegerGType;

public interface CapteurAsync {

	Future<Integer> getValue();
}