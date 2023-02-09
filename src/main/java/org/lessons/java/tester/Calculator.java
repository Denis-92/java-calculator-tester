package org.lessons.java.tester;

public class Calculator {
	
	public float add(float num1, float num2) {
		return num1 + num2;
	}
	
	public float subtract(float num1, float num2) {
		return num1 - num2;
	}
	
	public float divide(float num1, float num2) throws IllegalArgumentException {
		if (num2 == 0)
			throw new IllegalArgumentException("Errore: non si può dividere per 0");
		else
			return num1 / num2;
	}
	
	public float multiply(float num1, float num2){
		return num1 * num2;
	}
	
	// Scopo di questa esercitazione è di implementare i metodi di una semplice calcolatrice,
	//		e di scrivere una classe di test per verificare che funzionino come ci aspettiamo!
	// Creare una classe chiamata Calculator avente i seguenti metodi pubblici :
	//	- float add(float num1, float num2)
	//	- float subtract(float num1, float num2)
	//	- float divide(float num1, float num2)
	//	- float multiply(float num1, float num2)
	//	Creare in seguito una classe di test che abbia 4 metodi,
	//		ognuno per verificare il corretto funzionamento di ogni metodo presente nella classe Calculator.

}
