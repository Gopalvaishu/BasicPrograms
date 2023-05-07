package springs_demo;

public class Mobile {
	
	String brand;
	int ram;
	double cost;
	
	Sim sim;

	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", ram=" + ram + ", cost=" + cost + ", sim=" + sim + ", getBrand()="
				+ getBrand() + ", getRam()=" + getRam() + ", getCost()=" + getCost() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	
}