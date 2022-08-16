package com.operations.div;

import com.operations.variable.Variable;

public class Division {
	public double divide() {
		Variable v = new Variable();
		v.setA(10);
		v.setB(5);
		return (double)v.getA()/v.getB();
	}

}
