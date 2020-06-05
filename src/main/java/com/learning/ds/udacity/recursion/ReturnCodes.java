package com.learning.ds.udacity.recursion;

public class ReturnCodes {
	public static void main(String[] args) {
		returnCodes("1145", "");
	}

	private static void returnCodes(String inNumber, String codeSoFar) {
		if(inNumber == null || inNumber.length() == 0) {
			System.out.println(codeSoFar);
			return;
		}

		char oneChar = getChar(Integer.parseInt(inNumber.substring(0,1)));
		returnCodes(inNumber.substring(1, inNumber.length()), codeSoFar + oneChar);

		if(inNumber.length() >= 2) {
			int twoDigitNumber = Integer.parseInt(inNumber.substring(0,2));
			if(twoDigitNumber <= 26) {
				char twoChars = getChar(twoDigitNumber);
				returnCodes(inNumber.substring(2, inNumber.length()), codeSoFar + twoChars);
			}
		}
	}

	private static char getChar(int number) {
		switch (number) {
			case 1:
				return 'a';
			case 2:
				return 'b';
			case 3:
				return 'c'; 
			case 4:
				return 'd'; 
			case 5:
				return 'e'; 
			case 6:
				return 'f'; 
			case 7:
				return 'g'; 
			case 8:
				return 'h'; 
			case 9:
				return 'i'; 
			case 10:
				return 'j'; 
			case 11:
				return 'k'; 
			case 12:
				return 'L';
			case 13:
				return 'm'; 
			case 14:
				return 'n'; 
			case 15:
				return 'o'; 
			case 16:
				return 'p'; 
			case 17:
				return 'q'; 
			case 18:
				return 'r'; 
			case 19:
				return 's'; 
			case 20:
				return 't'; 
			case 21:
				return 'u'; 
			case 22:
				return 'v'; 
			case 23:
				return 'w'; 
			case 24:
				return 'x'; 
			case 25:
				return 'y'; 
			case 26:
				return 'z';
			default:
				return ' ';
		}
	}
}
