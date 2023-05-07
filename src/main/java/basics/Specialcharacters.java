package basics;

import java.util.Scanner;

public class Specialcharacters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
				String str=sc.nextLine();
				int count=0;
				for(int i=0;i<str.length();i++) {
					char ch=str.charAt(i);
					if(((ch>='A' && ch<='z' )||(ch>='a' && ch<='z')||(ch>='0' && ch<='9'))==false)
					{
						count++;
					}
				}
				System.out.println(count);
	}


}
