package com.operations.mod;

import com.operations.variable.Variable;

public class Mod {
	public int modulus() {
		Variable v = new Variable();
		v.setA(10);
		v.setB(5);
		return (int)v.getA()%(int)v.getB();
	}

}
