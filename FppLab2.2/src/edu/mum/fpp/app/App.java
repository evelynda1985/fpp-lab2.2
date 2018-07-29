package edu.mum.fpp.app;

import edu.mum.fpp.entity.Prog1;

public class App {

	public static void main(String[] args) {

		Prog1 p1 = new Prog1();
		
		System.out.println("x = " + p1.getX() + " Compute x: " + p1.computeX());
		System.out.println("y = " + p1.getY() + " Compute y: " + p1.computeY());
	

	}

}
