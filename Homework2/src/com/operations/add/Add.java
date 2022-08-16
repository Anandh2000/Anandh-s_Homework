package com.operations.add;

import com.operations.variable.Variable;

public class Add {
	public int add() {
		Variable v = new Variable();
		v.setA(10);
		v.setB(5);
		return (int)v.getA()+(int)v.getB();
	}
}
