package basics;

import java.util.Scanner;
public class Happynumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int sum;
		while(num>9)
		{
			sum=0;
			
			do {
				int d=num%10;
				sum=sum+d*d;
				num=num/10;
			}
			while(num!=0);
				num=sum;
		}
		if(num==1 || num==7)
			System.out.print("Happy Number");//only 1 and 7 is happy number 13-1sq + 3sq=10 so 13 is not happy no
		else 
			System.out.print("Not Happy Number");
	}
}
