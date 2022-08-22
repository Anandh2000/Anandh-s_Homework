package com.student;

public class doctor {
	final double pi = 3.14;
	int add(int a,int b) {
		return a+b;}
	int sub(int a,int b) {
		return a-b;
	}
	double div(double a,double b) {
		return a/b;
	}
	double multi(double a,double b) {
		return a*b;
	}
	int mod(int a,int b) {
		return a%b;
	}
	double pers(int a,int b) {
		return multi(div(a, b),100);
	}
	float square(int a) {
		return (float)multi(a,a);
	}
	double cube(int a) {
		return multi(multi(a,a),a);
	}
	double circlearea(int r) {
		return multi(square(r),pi);
	}
	double spherevol(int r) {
		return multi(multi(div(4,3),pi),cube(r));
	}
	public static void main(String[] args) {
		doctor x = new doctor();
		System.out.println(x.add(5, 5));
		System.out.println(x.sub(6,3));
		System.out.println(x.multi(5, 5));
		System.out.println(x.div(10,5));
		System.out.println(x.pers(477, 500));
		System.out.println(x.square(5));
		System.out.println(x.cube(5));
		System.out.println(x.circlearea(4));
		System.out.printf("%.2f",x.spherevol(5));	
	}
}
