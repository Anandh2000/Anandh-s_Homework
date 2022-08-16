package com.SimplenCompound;

public class Compound {
	public void compoundInterest(int p,double q, int n,int r){
		q = q/100;
		double c = 1+(q/n);
		double ans = (p*Math.pow(c,(n*r)))-p;
				
		System.out.println("Compound Interest = " +ans);
	}

}
