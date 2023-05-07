package basics;

import java.util.Scanner;
public class Primeno {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int temp;
	boolean isPrime=true;
	System.out.println("Enter any number");
	int num=sc.nextInt();
	
	sc.close();
	
	for(int i=2;i<=num/2;i++) {
		temp=num%i;
		if(temp==0)
		{
			isPrime=false;
			break;
		}
	}
	 if(isPrime)
		 System.out.println(num+" is a prime number");
	 else
		 System.out.println(num+" is not a prime number");
	
	
	
}
}
