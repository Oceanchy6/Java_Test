package com.chy.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test4 {

	/**
	 * 在一个集合中存储无序且重复的字符串,定义一个方法,让其有序(字典顺序),并且不删除重复的字符串
	 */
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("aaaa");
		al.add("aaaa");
		al.add("zzzzz");
		al.add("bb");
		al.add("bb");
		al.add("bb");
		al.add("ddddddd");
		al.add("ccccc");
		al.add("ffff");
		al.add("ffff");
		al.add("eeeeee");
		
		getList(al);
		
		System.out.println(al);
	}

	public static void getList(List<String> list) {
		TreeSet<String> ts=new TreeSet<String>(new Comparator<String>(){

			@Override
			public int compare(String s1, String s2) {
				int num=s1.compareTo(s2);					//利用了匿名内部类,因为继承comparator接口,利用比较器顺序
				return num==0?1:num;						//只需重写compare()这一个方法,所以可用匿名内部类
			}
			
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}

}
