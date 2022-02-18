package Afficheur;

import java.util.concurrent.ExecutionException;

import Subject.Subject;

public interface Observer<T> {
	
	public T update(Subject subject) throws InterruptedException, ExecutionException;
}