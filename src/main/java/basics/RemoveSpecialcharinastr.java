package basics;

public class RemoveSpecialcharinastr {
	public static void main(String[] args) {
		String str="Rama @ is A good & $^%$# ";
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||ch==' ') {
				ans=ans+ch;
				
			}
			System.out.println("Output-->"+ans);
		}
	}
}
//wap to remove vowels from agiven string
//String ans="";
//for(int i=0;i<str.length();i++)
//{
//	char ch=str.charAt(i);
//	if(((ch=='a' ||    ch=='e' ||  ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))==false){
//		ans=ans+ch;
//		
//	}
//	System.out.println("Output-->"+ans);
//}