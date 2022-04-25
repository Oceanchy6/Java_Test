package com.chy.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {

	/**
	 * 去除集合中的重合元素
	 */
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");
		al.add("a");
		al.add("b");
		al.add("b");
		al.add("b");
		al.add("d");
		al.add("d");
		al.add("d");
		al.add("d");
		
		getSingle(al);
		System.out.println(al);
	}

	public static void getSingle(List<String> list) {
		LinkedHashSet<String> hs=new LinkedHashSet<String>();		//前面加上Linked变成有序的
		hs.addAll(list);
		list.clear();
		list.addAll(hs);
	}

}
