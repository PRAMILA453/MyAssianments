package week1.day1;

public class Car {
	
	public void applyBreak() {
	System.out.println("Applied Break");
}
public void soundHorn() {
	System.out.println("Sound horn");
}
public static class Bike {
	
	public void applyBreak() {
		System.out.println("AppliedBreak in the bike");
	}
	public void soundHorn() {
		System.out.println("Soundhorn is ON the bike");
	}
	
	 
}
public static void main(String[] args) {
	Car mycar = new Car();
	mycar.applyBreak();
	mycar.soundHorn();
	
	Bike mybike=new Bike();
	mybike.applyBreak();
	mybike.soundHorn();
	System.out.println("This is my car ");
	
}
}
