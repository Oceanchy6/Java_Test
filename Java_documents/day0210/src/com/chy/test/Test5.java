package com.chy.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test5 {

	/**
	 * 键盘输入字符串,并将字符按字典顺序排序
	 * 对比Test2
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一列字符串:");
		String line=sc.nextLine();
		char[] arr=line.toCharArray();
		TreeSet<Character> ts=new TreeSet<Character>(new Comparator<Character>(){

			@Override
			public int compare(Character s1, Character s2) {		//匿名内部类
				int num=s1.compareTo(s2);
				return num==0?1:num;
			}			
		});
		for (char c : arr) {		//向集合中添加元素
			ts.add(c);
		}
		for (Character character : ts) {		//遍历集合中的元素
			System.out.print(character);
		}
	}

}
