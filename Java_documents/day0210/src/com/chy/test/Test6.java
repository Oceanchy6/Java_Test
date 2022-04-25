 package com.chy.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6 {

	/**
	 * 程序启动后,可以从键盘接受输入的多个整数,直到输入quit结束输入,并将正数按从大到小输出
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<Integer>(new Comparator<Integer>(){

			@Override
			public int compare(Integer s1, Integer s2) {
				int num=s2.compareTo(s1);
				return num==0?1:num;
			}
			
		});
		System.out.println("请输入整数:");

		while(true){
			String l=sc.nextLine();
			if("quit".equals(l)){
				break;
			}
			try{
				int num=Integer.parseInt(l);
			ts.add(num);
			}catch(Exception e){
				System.out.println("请您输入整数:");
			}
			
		}
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

}
