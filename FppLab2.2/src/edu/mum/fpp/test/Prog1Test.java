package edu.mum.fpp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.mum.fpp.entity.Prog1;
import edu.mum.fpp.entity.RandomNumbers;


public class Prog1Test {

	@Test
	public void testRandomNumber() {
		
		//Test 1 -> the x and y are in the range
		RandomNumbers n1 = new RandomNumbers(9, 4);
		
		assertEquals(9, n1.getRandomNumberX());
		assertEquals(4, n1.getRandomNumberY());
		
		//Test 2 -> the x is not in the range
		RandomNumbers n2 = new RandomNumbers(55, 4);
		
		assertEquals(3, n2.getRandomNumberX());
		assertEquals(4, n2.getRandomNumberY());
		
		//Test 3 -> the y is not in the range
		
		RandomNumbers n3 = new RandomNumbers(55, 15);
		
		assertEquals(3, n3.getRandomNumberX());
		assertEquals(7, n3.getRandomNumberY());
		
	}
	
	@Test
	public void testProg1() {
		
		//Test 1 -> x and y are in the range
		Prog1 p1 =  new Prog1(3, 7);
		
		assertEquals(31.006276680299816, p1.computeX(), 0.0);
		assertEquals(451.8078725860401, p1.computeY(),  0.0);
		
		//Test 2 -> x and y are in the range
		
		Prog1 p2 =  new Prog1(6, 6);
		
		assertEquals(961.3891935753043, p2.computeX(), 0.0);
		assertEquals(278.3775777503137, p2.computeY(),  0.0);
		
		
	}

}
