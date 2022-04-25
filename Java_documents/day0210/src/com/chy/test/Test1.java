package com.chy.test;

import java.util.HashSet;
import java.util.Random;

public class Test1 {
	/*
	 * 编写一个程序,要求输出10个不重复的1到20的整数
	 * 
	 * */
public static void main(String[] args){
	HashSet<Integer> hs=new HashSet<Integer>();
	Random r=new Random();
	/*while(hs.size()<=10){//法一
		hs.add(r.nextInt(20)+1);
	}
	for (Integer integer : hs) {
		System.out.println(integer);
	}*/
	for (int i = 0; ; i++) {	//法二
		hs.add(r.nextInt(20)+1);
		if(hs.size()==10)
			for (Integer integer : hs) {
				System.out.println(integer);
			}
	}
	
	
}
}
