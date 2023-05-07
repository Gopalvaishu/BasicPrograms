package basics;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=10,a=0,b=1;
		System.out.println("FibonacciSeries"+n+"terms");
		for(int i=1;i<=n;++i) {
			System.out.print(a+",");
			int nextTerm=a+b;
			a=b;
			b=nextTerm;
		}
	}

}
