package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class Numeral2RomanCell implements SmartCell {
	private String romanNumber = "";
	
    private static final String[] romanValue    = {"M", "CM", "D", "CD", "C", "XC", "L",
         										        "XL", "X", "IX", "V", "IV", "I"};
    
    private static final int[]    numeralValue  = {1000, 900, 500, 400,  100,   90,  50,
         										         40,   10,    9,   5,   4,    1};
	
	
	private String convert(int n) {
		
		for (int index = 0; index < romanValue.length; index++) {
			while (n >= numeralValue[index]) {
				n -= numeralValue[index];
				romanNumber  += romanValue[index];
			}
		}
		
		return romanNumber;
	}

	private int toNumber(char c) {
		char[] carnumbers = {'0','1','2','3','4','5','6','7','8','9'};
		int[] numbers = {0,1,2,3,4,5,6,7,8,9};
		for (int i = 0 ; i < 10 ; i++) {
			if (c == carnumbers[i])
				return numbers[i];
		}
		return 0;
	}
	
	public String ask(String question) {
		if (question.contains("en romain?")) {
			int n = 0;
			for(int i = 0 ; i < question.length() ; i++){
				n += toNumber(question.charAt(i));
			}
			return convert(n);
		}
		else
			return null;
	}

}
