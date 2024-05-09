package com.nt.service;

import com.nt.util.StringUtil;

/**
 * Hello world!
 *
 */
public class FlipkartOperation {
	public static void main(String[] args) {
		int tokensCount = StringUtil.countWords("Hello, how are you ? ");
		System.out.println("flipkart ::" + tokensCount);
	}
}
