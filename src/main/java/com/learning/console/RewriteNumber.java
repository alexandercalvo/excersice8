package com.learning.console;

import java.util.ArrayList;
import java.util.Scanner;

import com.learning.add.PrimeNumbers;

public class RewriteNumber {
public static void main(String[] args) {
	System.out.println("ingrese un numero par mayor que 2");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	ArrayList<String>numbers = PrimeNumbers.addNumber(number);
	for (String num: numbers) {
		System.out.println(num+"\n");
	}
}
}
