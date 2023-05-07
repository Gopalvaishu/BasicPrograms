package basics;

import java.util.Scanner;

public class XylemorPhloemno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int Isum=0;
		int Osum=0;
		int copy=no;
		
		while(no!=0) {
			if(no==copy || no<10)
				Osum=Osum+no%10;
			else
				Isum=Isum+no%10;
			no=no/10;
		}
		if(Isum==Osum)
			System.out.println("Xylem number");
		else
			System.out.println("pholem number");
	}

}
