 package com.chy.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6 {

	/**
	 * ����������,���ԴӼ��̽�������Ķ������,ֱ������quit��������,�����������Ӵ�С���
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
		System.out.println("����������:");

		while(true){
			String l=sc.nextLine();
			if("quit".equals(l)){
				break;
			}
			try{
				int num=Integer.parseInt(l);
			ts.add(num);
			}catch(Exception e){
				System.out.println("������������:");
			}
			
		}
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

}
