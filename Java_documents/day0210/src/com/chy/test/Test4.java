package com.chy.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test4 {

	/**
	 * ��һ�������д洢�������ظ����ַ���,����һ������,��������(�ֵ�˳��),���Ҳ�ɾ���ظ����ַ���
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
				int num=s1.compareTo(s2);					//�����������ڲ���,��Ϊ�̳�comparator�ӿ�,���ñȽ���˳��
				return num==0?1:num;						//ֻ����дcompare()��һ������,���Կ��������ڲ���
			}
			
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}

}
