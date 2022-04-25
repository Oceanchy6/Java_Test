package com.chy.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Test2 {

	/**
	 * 键盘输入字符串,将其中重复的变成单一的
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String line=sc.nextLine();
		//TreeSet<Character> hs=new TreeSet<Character>();
		HashSet<Character> hs=new HashSet<Character>();
		char[] arr=line.toCharArray();
		/*for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}*/
		for (char c : arr) {
			hs.add(c);
		}
		for (Character c : hs) {
			System.out.print(c);
		}
	}

}
