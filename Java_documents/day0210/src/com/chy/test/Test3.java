package com.chy.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {

	/**
	 * ȥ�������е��غ�Ԫ��
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
		LinkedHashSet<String> hs=new LinkedHashSet<String>();		//ǰ�����Linked��������
		hs.addAll(list);
		list.clear();
		list.addAll(hs);
	}

}
