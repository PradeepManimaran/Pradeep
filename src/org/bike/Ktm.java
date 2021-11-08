package org.bike;
public class Ktm implements Bike {
	public void cost() {
		System.out.println("Cost: 1,80,000 rs");
	}
	public void speed() {
		System.out.println("Speed: 220km/hr");
	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
		k.cc();
	}
}
