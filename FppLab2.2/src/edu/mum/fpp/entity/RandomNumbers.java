package edu.mum.fpp.entity;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class RandomNumbers {
	
	LocalDateTime now = LocalDateTime.now();
	private int x = now.getSecond();
	private int y = now.getSecond();;
	
	public RandomNumbers() {}
	
	//Test propose only
	public RandomNumbers(int x, int y) {
		this.x = x;
		this.y = y;
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
	
	//get a random number x in the range 1 .. 9
	public int getRandomNumberX() {
		
		System.out.println("x =" + x);
		
		if ((x == 0 ) || (x > 9)){
			x = 3;	
		}
		
		return x;
	}
	
	//get a random number y in the range 3 .. 14
	public int getRandomNumberY() {
		
		System.out.println("y = " + y);
		
		if ((y < 3 ) || (y > 14)){
			y = 7;	
		}
		
		return y;
	}

	@Override
	public String toString() {
		return "RandomNumbers [x=" + x + ", y=" + y + "]";
	}
	
	

}
