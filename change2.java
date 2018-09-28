package myfirstpackage;

import java.util.Scanner;

public class change2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter change from 1 to 99 : ");
		
		int change = s.nextInt();
		isChange(change);
	}
		
	public static void isChange(int change)
	{	
		int q = change / 25;
		change = change -(q * 25);
		
		int d = change / 10;
		change = change - (d *10);
		
		int n = change / 5;
		change = change - (5 *n);
		
		int p = change / 1;
		change = change - (1 * p);
		
		System.out.println("Number of Quarters : " + q + '\n' + "NUmber of dimes : " + d + '\n' + "number of nickels : " + n + '\n' + "Number of Pennies : " + p);
		
	}	

}
