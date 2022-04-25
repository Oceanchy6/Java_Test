package com.chy.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.chy.bean.Person;

public class Chy4_TreeSet {

	/**
	 * @param args
	 * TreeSet集合是用来对象元素进行排序的,同样他也可以保证元素的唯一
	 * 当compareTo方法返回0的时候集合中只有一个元素
	 * 当compareTo方法返回正数的时候集合会怎么存就怎么取
	 * 当compareTo方法返回负数的时候集合会倒序存储
	 */
	private static int[] as = new int[] {1,2,3,4,5,6,7,8,9};
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		//method1();
		//method2();			//二叉树的思想,主要看CompareTo方法的值为正数按先进先出,负数的话先进后出,0的话不出
		//method3();
		//method4();
	/*	TreeSet<String> ts=new TreeSet<String>(new CompareByLength());		//括号里是按父类引用指向子类对象的方法
		ts.add("aaaaaaa");
		ts.add("z");
		ts.add("bs");
		ts.add("rsd");
		ts.add("tsss");
		System.out.println(ts);*/
	/*	StringBuilder sb=new StringBuilder();
		sb.append(2);
		sb.append(3);
		sb.append(4);
		sb.append(5);
		System.out.println(sb.toString());*/
		fenzu(as);
	}
	private static void fenzu(int[] as2) {
		for (int i : as2) {
			sb.append(i);
		}
		System.out.println(sb);
		int A=Integer.parseInt(sb.substring(0, 3))	;
		int B=Integer.parseInt(sb.substring(3, 6))	;
		int C=Integer.parseInt(sb.substring(6, 9))	;
		System.out.print(A+" ");
		System.out.print(B+" ");
		System.out.print(C);
	}

	public static void method4() {
		TreeSet<Person> ts=new TreeSet<Person>();
		ts.add(new Person("zhangsan", 23));
		ts.add(new Person("lisi", 24));
		ts.add(new Person("lisis", 24));
		ts.add(new Person("wangwu", 25));
		ts.add(new Person("zhaoliu", 26));
		System.out.println(ts);
	}

	public static void method3() {
		TreeSet<Person>ts =new TreeSet<Person>();		//按照姓名排序
		ts.add(new Person("李四", 24));
		ts.add(new Person("张三", 23));
		ts.add(new Person("王五", 25));
		ts.add(new Person("赵六", 26));
		ts.add(new Person("李逵", 23));
		System.out.println(ts);
	}

	public static void method2() {
		TreeSet<Person>ts =new TreeSet<Person>();		//按照年龄排序
		ts.add(new Person("张三", 23));
		ts.add(new Person("李逵", 23));
		ts.add(new Person("赵六", 26));
		ts.add(new Person("李四", 24));
		ts.add(new Person("王五", 25));
		System.out.println(ts);
	} 

	public static void method1() {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("a");
		ts.add("a");
		ts.add("b");
		ts.add("b");
		ts.add("c");
		ts.add("c");
		ts.add("c");
		System.out.println(ts);
	}

}

class CompareByLength implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int num=s1.length()-s2.length();
		return num==0?s1.compareTo(s2):num;
	}
	
}
