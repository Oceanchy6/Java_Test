package com.chy.set;

import java.util.LinkedHashSet;

public class Chy3_LinkedHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("a");
		lhs.add("b");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		System.out.println(lhs);
	}

}
