package basics;

import java.util.Scanner;

//Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number. Given a number, check if it is a Strong Number or not.
public class Strongno {
	public static void main(String[] args) {
		Scanner sc;
		int Number, Temp, Reminder, Sum = 0, i, Factorial;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		Number = sc.nextInt();		
		
		Temp = Number;
		while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		    System.out.println(" The Factorial of " + Reminder + "  =  " + Factorial);
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
		
		System.out.println(" The Sum of the Factorials of a Given Number " + Number + " =  " + Sum);
		
		if ( Number == Sum )
		{
			System.out.println("\n " + Number + " is a Strong Number");
		}
		else
		{
		   System.out.println("\n " + Number + " is Not a Strong Number");
		}
	}
		
}	
		
		
		
		
	
