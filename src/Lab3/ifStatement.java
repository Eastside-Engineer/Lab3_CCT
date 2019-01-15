package Lab3;

import java.util.Scanner;

public class ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Give me a number: ");
		int userinput = scnr.nextInt();
		
		//int userinput = 1; userinput <= 100; userinput++) {
			
			
					if  ( userinput % 2 != 0) {
						System.out.print("Odd");
					}
					else if  ((userinput % 2 == 0)& userinput <= 25) {
						System.out.println("Even and less than 25");
					}
					else if ((userinput % 2 == 0)& userinput > 25 && userinput <= 60) {
						System.out.println("Even");
					}
					else if ((userinput % 2 == 0)& userinput > 60) {
						System.out.println("Even");
					}
					else if (userinput % 2 != 0 && userinput > 60) {
						System.out.print("Odd and over 60");
					}
					else if  (userinput > 100) {
						System.out.println("Numbers must be between 1 - 100");
					}
					else 
						System.out.println("That is All");
			}

	     
	} 

		
		
	
