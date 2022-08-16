package com.operations.square;


import com.operations.variable.Variable;

public class Square {
	
	public int square() {
		Variable v = new Variable();
		v.setA(10);
	
		return (int)v.getA()*(int)v.getA();
	}

}
