package com.operations.sub;

import com.operations.variable.Variable;

public class Subtraction {
	public int sub() {
		Variable v = new Variable();
		v.setA(10);
		v.setB(5);
		return (int)v.getA()-(int)v.getB();
	}
}
