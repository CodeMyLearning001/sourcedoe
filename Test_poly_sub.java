package com.tcs.poly;

public class Test_poly_sub extends Test_poly{
	static int a = 50;
	int x = 60;
	static void m1() {
		System.out.println("sub m1");
	}
	void m2() {
		super.m2();
		System.out.println("sub m2");
	}
	void m3() {
		System.out.println("sub m3");
		System.out.println(a);
		System.out.println(x);
	}
	void m4() {
		super.a = a;
		super.x = x;
	}
	public static void main(String[] args) {
		System.out.println("main method is executed");
		Test_poly_sub p = new Test_poly_sub();
		Test_poly_sub l = new Test_poly_sub();
		Test_poly     s = new Test_poly_sub();
		p.a=13;
		p.x=15;
		l.a=18;
		l.x=19;
		s.a=22;
		s.x=33;
		System.out.println();
		l.m1();
		l.m2();
		l.m3();
		l.m4();
		System.out.println();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
	}

}
