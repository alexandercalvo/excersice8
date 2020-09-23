package com.learning.add;

import java.util.ArrayList;

public class PrimeNumbers {

	public static boolean checkPrimeNumber(int number) {
		int acount = 2;
		boolean prime = true;
		while (prime && acount != number) {
			if (number % acount == 0) {
				prime = false;
			}
			acount++;
		}
		return prime;
	}

	public static ArrayList<String> addNumber(int number) {
		ArrayList<String>numbers = new ArrayList<String>();
		if (number % 2 == 0) {
			for (int acount = 2; acount < number; acount++) {
				if (checkPrimeNumber(acount)) {
					for (int acount2 = acount; acount2 < number; acount2++) {
						if (checkPrimeNumber(acount2)) {
							if (acount + acount2 == number && acount!=acount2) {
								String numero="el numero : " + number + " se  "
										+ "puede escribir como: \n" + acount+" + "+acount2;
								
								numbers.add(numero);
								
							}
						}

					}
				} else {
					continue;
				}
			}

		}
		return numbers;
	}

	
}
