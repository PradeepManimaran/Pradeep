package org.ab;

public class Abs extends Traction {
	@Override
	public void login() {
		System.out.println("Login");
	}
	@Override
	public void addcart() {
		System.out.println("AddCart");
	}
	public static void main(String[] args) {
		Abs a = new Abs();
		a.login();
		a.addcart();
		a.payment();		
	}
}
