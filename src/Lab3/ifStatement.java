package Lab3;

import java.util.Scanner;

public class ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userinput;
		String choice = ("y");// allows users to pick Y to continue
		
		while (choice.equalsIgnoreCase("y")) {//This allows input to take any case of y
		
		Scanner scnr = new Scanner(System.in);
	
			
			do {// do - loop to make user pick between 1-100.
				System.out.println("Give me a number: ");
				userinput = scnr.nextInt();
				
				if (userinput < 1 || userinput > 100) {
					System.out.println("Numbers must be between 1 - 100");
				}
			} while(userinput < 1 || userinput > 100);
			
			
				if  ( userinput % 2 != 0 && userinput <= 60) {
						System.out.println("Odd");
					}
					else if  ((userinput % 2 == 0) & userinput <= 25) {
						System.out.println("Even and less than 25");
					}
					else if ((userinput % 2 == 0) & userinput > 25 && userinput <= 60) {
						System.out.println("Even");
					}
					else if ((userinput % 2 == 0) & userinput > 60) {
						System.out.println("Even");
					}
					else if (userinput % 2 != 0 && userinput > 60) {
						System.out.println("Odd and over 60");
					
					}
					System.out.println("Continue: Press Y or any key to exit");//Allows user to exit program
					choice = scnr.next();
				}
						System.out.println("STEP AWAY FROM THE PRO!");
			}
	} 

		
		
	
