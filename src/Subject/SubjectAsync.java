package Subject;

import java.util.concurrent.Future;

import Afficheur.Observer;

public interface SubjectAsync extends Subject<Future<Integer>> {

	Future<Integer> getValue(Observer observer);
	
}
