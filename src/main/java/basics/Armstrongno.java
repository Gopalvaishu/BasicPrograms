package basics;

import java.util.Scanner;

public class Armstrongno {
/*Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.

Let's try to understand why 153 is an Armstrong number.

153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153  */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,number,temp,total=0;
		System.out.println("Enter 3 digit number:");
		num=sc.nextInt();
		sc.close();
		number=num;
		for(;number!=0;number/=10) {
			temp=number%10;
			total=total+temp*temp*temp;
		}
		if(total==num)
			System.out.println(num+"is a armstrong number");
		else
			System.out.println(num+"is not a armstrong number");
	}
}
