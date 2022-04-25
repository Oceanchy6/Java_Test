package com.chy.set;

import java.util.HashSet;

public class Chy1_HashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		boolean b1=hs.add("a");
		boolean b2=hs.add("a");
		System.out.println(hs);		//[a],他的继承系里重写了toString方法
		System.out.println(b1);		//true
		System.out.println(b2);		//false
		hs.add("a");
		hs.add("b");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		
		for (String string : hs) {
			System.out.println(string);			//只要能用迭代器的都可以用增强for循环遍历
		}
		
	}

}
