package com.chy.test;

import java.util.HashSet;
import java.util.Random;

public class Test1 {
	/*
	 * ��дһ������,Ҫ�����10�����ظ���1��20������
	 * 
	 * */
public static void main(String[] args){
	HashSet<Integer> hs=new HashSet<Integer>();
	Random r=new Random();
	/*while(hs.size()<=10){//��һ
		hs.add(r.nextInt(20)+1);
	}
	for (Integer integer : hs) {
		System.out.println(integer);
	}*/
	for (int i = 0; ; i++) {	//����
		hs.add(r.nextInt(20)+1);
		if(hs.size()==10)
			for (Integer integer : hs) {
				System.out.println(integer);
			}
	}
	
	
}
}
