package basics;

//import java.util.Scanner;
public class Stringuppercasetolowercase {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		 String uppStr;
//		 
//		 System.out.println("Enter the uppercase string to convert:");
//		 uppStr=sc.nextLine();
//		 
//		 String uppStr2=uppStr.toLowerCase();using inbuilt fun i.e, toLowerCase
//		 System.out.println("The Lowercase String:"+uppStr2);

		String str="BOSS";
		String Ans="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int x=(int)ch;//without using inbuilt fun
			ch=(char)(x+32);
			Ans=Ans+ch;
		}
		System.out.println(Ans);
		
	}
	
	
	

}
