package basics;

import java.util.Scanner;

public class PasswordValidation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String pwd=sc.nextLine();
		int Ucount=0;
		int Lcount=0;
		int Ncount=0;
		int Scount=0;
		
		if(pwd.length()>=8) {
			
			for(int i=0;i<pwd.length();i++)
			{
				char ch =pwd.charAt(i);
				if(ch>='A' && ch<='Z')
					Ucount++;
				else if(ch>='a' && ch<='z')
					Lcount++;
				else if(ch>='0' && ch<='9')
					Ncount++;
				else
					Scount++;
			}
		
			if(Ucount>=1 && Lcount>=1 && Ncount>=1 && Scount>=1 &&(pwd.charAt(pwd.length())-1=='#'))
			System.out.println("Valid Password");
			else 
				System.out.println("Invalid");
		
		}
		
		else 
			System.out.println("Invalid");
	
		
	

}
}
