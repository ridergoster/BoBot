package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class Roman2NumeralCell implements SmartCell {

	private int number = 0;

	private int convert (String str) {
		
		if (str.length() != 0)
			number = romanValue(str.charAt(0));
		
		getFullRomanValue(str);	
		
		return number;
	}

	private void getFullRomanValue(String str) {
		for (int i = 1 ; i < str.length() ; i++) {
			if (romanValue(str.charAt(i)) <= romanValue(str.charAt(i-1))) // ajouter une valeur actuelle qui est inferieure a la valeur precedente
				
				number = romanValue(str.charAt(i)) + number;
			
			else {// soustraire une valeur precedente qui est inferieure a la valeur actuelle 
				
				number = -romanValue(str.charAt(i-1)) + number; // on enleve l'ajout en trop d'une valeur obtenu par une iteration puisque ce bloc condition est atteint 
																// (on se rend compte que la valeur precedente ajoutee au dessus etait inferieure à la valeur actuellement testee)
				
				int diff = romanValue(str.charAt(i)) - romanValue(str.charAt(i-1)) ; // soustraction classique entre pos courante et pos precedente
				
				number = diff + number; // on applique cette difference au number courant
			}
		}
	}

	private int romanValue(char C) {
		switch(C) {
			case 'I' : return 1;
			
			case 'V' : return 5;
			
			case 'X' : return 10;
			
			case 'L' : return 50;
			
			case 'C' : return 100;
			
			case 'M' : return 1000;
			
			default : return 0;
		}
	}

	public String ask(String question) {
		if (question.contains("en nombre arabe?")) {
			return toString(convert(question));
		}
		return null;
	}

	private String toString(int n) {
		return ""+n;
	}
}
