package basics;
//pgm to print FizzBuzz if the no is divisible by 3 and 7 or print FizzFizz if the number is divisible by 3 or print BuzzBuzz
// if the no is divisible by 7
public class Ifelsecondn {
	public static void main(String[] args) {
		int no=7;
		if(no%3==0 && no%7==0)
		{
			System.out.println("FizzBuzz");
		}
		else if(no%3==0)
		{
			System.out.println("FizzFizz");
		}
		else if (no%7==0)
		{
			System.out.println("BuzzBuzz");
			
		}
		else {
			System.out.println("Invalid number");
		}
	}

}
