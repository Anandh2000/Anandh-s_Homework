package com.operations.Calc;

import com.operations.add.Add;
import com.operations.circle.Circle;
import com.operations.cube.Cube;
import com.operations.div.Division;
import com.operations.mod.Mod;
import com.operations.multi.Multi;
import com.operations.pers.Perscentage;
import com.operations.sphere.Spherevol;
import com.operations.square.Square;
import com.operations.sub.Subtraction;

public class calc {
	
	public static void main(String[] args) {
		System.out.println("Addition : " + new Add().add());
		System.out.println("Subtraction : " + new Subtraction().sub());
		System.out.println("Multiplication :" + new Multi().multiply());
		System.out.println("Division : " + new Division().divide());
		System.out.println("Mod :" + new Mod().modulus());
		System.out.printf("Perscentage :%.2f\n" ,new Perscentage().pers());
		System.out.println("Square of a num : " + new Square().square());
		System.out.println("Cube of a num : "+ new Cube().cub());
		System.out.println("Area of circle : " + new Circle().circ());
		System.out.printf("Volume of Sphere : %.2f", new Spherevol().sphere());
	}

}
