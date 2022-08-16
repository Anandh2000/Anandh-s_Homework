package com.SimplenCompound;

public class Simple {
	public void simpleInterest(int p,float q,int r) {
		q = q/100;
		double ans = p * q * r;
		System.out.println("Simple Interest = " +ans);
	}

}
