package org.bike;

public interface Bike {
	void cost();
	void speed();
	default void cc() {
		System.out.println("Weight: 250cc");
	}
	
}
