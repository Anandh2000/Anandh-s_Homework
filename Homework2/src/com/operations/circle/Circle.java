package com.operations.circle;

import com.operations.multi.Multi;
import com.operations.square.Square;
import com.operations.variable.Variable;

public class Circle {
	public double circ() {
		Variable v = new Variable();
		v.setA(10);
		
		return v.getA()*v.getA()*3.14;
	}
}
