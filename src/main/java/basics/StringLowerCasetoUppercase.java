package basics;

import java.util.Scanner;

public class StringLowerCasetoUppercase {
	public static void main(String[] args) {
//		Scanner sc=new Scanner (System.in);
//		String lowStr;
//		
//		System.out.println("Enter the Lower String:");
//		lowStr =sc.nextLine();
//		
//		String lowStr2=lowStr.toUpperCase();using inbuilt function i.e,toUpperCase
//		System.out.println("The uppercase string:"+lowStr2);

	String str="boss";
	String Ans="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		int x=(int)ch;//without using inbuilt fun
		ch=(char)(x-32);
		Ans=Ans+ch;
	}
	System.out.println(Ans);
	}
	
	

}
