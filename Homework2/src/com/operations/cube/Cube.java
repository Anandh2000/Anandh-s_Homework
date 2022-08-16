package com.operations.cube;

import com.operations.variable.Variable;

public class Cube {
	public double cub() {
		Variable v = new Variable();
		v.setA(10);
		
		return v.getA()* v.getA()*v.getA();
	}
}
