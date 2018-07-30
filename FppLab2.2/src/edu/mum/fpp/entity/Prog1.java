package edu.mum.fpp.entity;

import java.text.DecimalFormat;

public class Prog1 {
	
	private RandomNumbers random = new RandomNumbers();
	private double pi = Math.PI;
	private int x = random.getRandomNumberX();
	private int y = random.getRandomNumberY();
	
	public Prog1() {}
	
	//For testing propose only
	public Prog1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public RandomNumbers getRandom() {
		return random;
	}

	public void setRandom(RandomNumbers random) {
		this.random = random;
	}



	public double getPi() {
		return pi;
	}



	public void setPi(double pi) {
		this.pi = pi;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}


	//compute pi pow x
	public double computeX() {
		
		return Math.pow(pi, x);
		
	}
	
	//compute y pow pi
	public double computeY() {
		
		return Math.pow(y, pi);
		
	}

	@Override
	public String toString() {
		return "Prog1 [x=" + x + ", y=" + y + "]";
	}
	
	

}
