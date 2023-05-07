package basics;

import java.util.Scanner;

//wap to  convert str from Upp to lower case when mixture of string without using inbuilt function
public class UtoLowerwhenthemixtureofstr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.next();
		String Ans=" ";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{
				 int x=(int)ch;
				Ans=Ans+(char)(x+32);
			}
			else
				Ans=Ans+ch;
			System.out.print(Ans);
		}
		}

}
//from lower to upper change the
//if(ch>='a' &&  ch<='z')
//int x=(int)ch;
//Ans=Ans+(char)(x-2)
//remaining are same