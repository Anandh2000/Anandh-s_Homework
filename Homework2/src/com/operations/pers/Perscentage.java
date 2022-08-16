package com.operations.pers;


import com.operations.variable.Variable;

public class Perscentage {
	public double pers() {
		Variable v = new Variable();
		v.setA(477);
		v.setB(500);
		return v.getA()/v.getB()*100;
	}

}
