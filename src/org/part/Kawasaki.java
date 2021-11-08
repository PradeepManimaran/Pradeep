package org.part;
public class Kawasaki extends Bike {
	public void type() {
		System.out.println("Sports Type");
	}
	public void speed() {
		System.out.println("Max Speed 290km/hr");
	}
	public static void main(String[] args) {
		Kawasaki k = new Kawasaki();
		k.type();
		k.speed();
		k.gear();	
	}
}
