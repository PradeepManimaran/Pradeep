package org.computer;
public class Desktop implements Hardware,Software {
	public void desk() {
		System.out.println("HP");
	}
	public void soft() {
		System.out.println("Windows 10");
	}
	public void hR() {
		System.out.println("CORE I3");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desk();
		d.soft();
		d.hR();
		}}