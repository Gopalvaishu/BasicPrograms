package basics;

import java.util.Scanner;


public class Perfectno {
	public static void main(String arg[])	
	{
	    long n,sum=0;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter a number");
                   n=sc.nextLong();
	    int i=1;
	    while(i<=n/2)
	    {
	       if(n%i==0)
	       {
		sum+=i;
	       }
	      i++;
	    }
	if(sum==n)
	{
	System.out.println(n+" is a perfect number");
               } 
	else
	System.out.println(n+" is not a  perfect number"); //6 is perfect number bcz the factors of 6 is 3,2,1 and sum of tht factors also 6 ,so 
	}//6 is perfect number
}


//to print perfect no from 1 to 100 o/p is 6 and 28 
/*import java.util.*;
class Perfectno
{
	public static void main(String arr[])
	{
		int i,j,c;
		for(i=1;i<=100;i++)
		{
			c=0;
			for(j=1;j<i;j++)
			{
				if(i%j==0)
				c+=j;
			}
			if(c==i)
				System.out.println(i);
		}
	}
}*/