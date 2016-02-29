package com.dominic.test;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello please type something and press return");		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("You said "+input);
		System.out.println("The lenght of your input is "+input.length());
	}
}
