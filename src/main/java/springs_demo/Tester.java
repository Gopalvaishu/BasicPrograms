package springs_demo;

public class Tester {
	
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.setBrand("Iphone");
		m1.setCost(150000);
		m1.setRam(8);
	m1.setSim(new Airtel());
		System.out.println(m1);
	
		Mobile m2=new Mobile();
		m2.setBrand("Redmiiiii");
		m2.setCost(160000);
		m2.setRam(7);
		m2.setSim(new Jio());
		System.out.println(m2);
		
		
		
	}

}
