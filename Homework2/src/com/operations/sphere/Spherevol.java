package com.operations.sphere;

import com.operations.variable.Variable;

public class Spherevol {
	public double sphere() {
		Variable v = new Variable();
		v.setA(10);
		
		return 4/3*3.14*v.getA()*v.getA()*v.getA();
	}
}
