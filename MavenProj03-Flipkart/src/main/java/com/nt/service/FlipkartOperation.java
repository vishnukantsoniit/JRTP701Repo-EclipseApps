package com.nt.service;

/**
 * Hello world!
 *
 */

public class FlipkartOperation {

	public int sum(int x, int y) {
		return x + y;
	}

	public int sum(int x, int y, int z) {
		return x + y;
	}
	
	public int mul(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
	
	public String reverse(String name) {
		StringBuffer sb = new StringBuffer(name);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		FlipkartOperation fo = new FlipkartOperation();
		System.out.println("sum is :" + fo.sum(10, 20));
		System.out.println("sum is :" + fo.sum(10, 20, 30));
		System.out.println("mul is :" + fo.sum(10, 20));
		System.out.println("div is the :" + fo.sum(10, 20));
		System.out.println("I'M checking only");
		System.out.println("Dev1 I'M checking only");
	}
}