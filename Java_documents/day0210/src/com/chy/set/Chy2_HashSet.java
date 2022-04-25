package com.chy.set;

import java.util.HashSet;

import com.chy.bean.Person;

public class Chy2_HashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<Person> hs=new HashSet<Person>();
		hs.add(new Person("张三",23));
		hs.add(new Person("张三",23));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		//System.out.println(hs.size());
		System.out.println(hs);
				
		
		
	}

}
