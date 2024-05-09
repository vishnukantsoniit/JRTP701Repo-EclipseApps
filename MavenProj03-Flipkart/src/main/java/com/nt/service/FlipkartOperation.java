package com.nt.service;

import com.nt.util.StringUtil;

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

	public static void main(String[] args) {
		FlipkartOperation fo = new FlipkartOperation();
		System.out.println("sum is :" + fo.sum(10, 20));
		System.out.println("sum is :" + fo.sum(10, 20, 30));
		System.out.println("mul is :" + fo.sum(10, 20));
	}
}
