package com.SimplenCompound;

public class Main {

	public static void main(String[] args) {
		Cube c = new Cube();
		c.cube(2.2);
		Simple si = new Simple();
		si.simpleInterest(2000, 10, 1);
		Compound ci = new Compound();
		ci.compoundInterest(2000, 1, 1, 2);
		DivisionFinder d = new DivisionFinder();
		d.division(30,40, 50, 45, 35);
		
	}

}
