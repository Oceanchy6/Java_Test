package com.chy.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test5 {

	/**
	 * ���������ַ���,�����ַ����ֵ�˳������
	 * �Ա�Test2
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String line=sc.nextLine();
		char[] arr=line.toCharArray();
		TreeSet<Character> ts=new TreeSet<Character>(new Comparator<Character>(){

			@Override
			public int compare(Character s1, Character s2) {		//�����ڲ���
				int num=s1.compareTo(s2);
				return num==0?1:num;
			}			
		});
		for (char c : arr) {		//�򼯺������Ԫ��
			ts.add(c);
		}
		for (Character character : ts) {		//���������е�Ԫ��
			System.out.print(character);
		}
	}

}
