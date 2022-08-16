package com.operations.multi;

import com.operations.variable.Variable;

public class Multi {
	public double multiply() {
		Variable v = new Variable();
		v.setA(10);
		v.setB(5);
		return v.getA()*v.getB();
	}

}
