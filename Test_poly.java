package com.tcs.poly;

public class Test_poly {
	static int a = 10;
	       int x = 20;
	static void m1() {
		System.out.println("super m1");
	}
	       void m2() {
	    	   m1();
	    	   System.out.println("super m2");
	       }
	       void m3() {
	    	   System.out.println("super m3");
	    	   System.out.println(a);
	    	   System.out.println(x);
	       }
	       void m4() {
	    	   System.out.println("super m4");
	       }

}
