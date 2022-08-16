package com.SimplenCompound;

public class DivisionFinder {
	public void division(int s1,int s2,int s3,int s4,int s5) {
		double ave = (s1+s2+s3+s4+s5)/5;
		if (ave >= 60) {
			System.out.println("First division");
		}
		else if(ave > 49 && ave < 60) {
			System.out.println("Second division");
		}
		else if(ave > 39 && ave < 50) {
			System.out.println("Third division");
		}
		else {
			System.out.println("Fail");
		}
	}
}
