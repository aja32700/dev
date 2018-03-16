//ElectricFan.java
//public class ElectricFan{


public class ElectricFanDemo{
	public static void main(String args[]){
		//int i;
		//Scanner sc;
		ElectricFan e=new ElectricFan(); //instantiation
		// this is the part where ElectricFan.java is loaded into memory and stored to e
		e.speed=100;
		e.brand= "Standard";
		System.out.println("Brand is: " + e.brand + " with speed " + e.speed);
	}
}