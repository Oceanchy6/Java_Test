package com.chy.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.chy.bean.Student;

public class Test7 {

	/**
	 * 需求:键盘输入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台
	 * 
	 * 分析:
	 * 1,定义一个学生类{
	 * 			成员变量:姓名,语文成绩,数学成绩,英语成绩,总成绩
	 * 			成员方法:空参,有参构造,有参构造的参数分别是姓名,语文成绩,数学成绩,英语成绩
	 * }
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入学生成绩:格式如下");
		System.out.println("姓名,语文成绩,数学成绩,英语成绩");
		TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {
				int num=s2.getSum()-s1.getSum();
				return num==0?1:num;
			}
			
		});
		while(ts.size()<5){
			String line=sc.nextLine();
			try{
				String[] str=line.split(",");
				int chinese=Integer.parseInt(str[1]);
				int math=Integer.parseInt(str[2]);
				int english=Integer.parseInt(str[3]);
				ts.add(new Student(str[0],chinese,math,english));
			}catch(Exception e){
				System.out.println("格式错误,正确的格式是:姓名,语文成绩,数学成绩,英语成绩");
			}
			
		}
		System.out.println("排序后的学生成绩为:");
		for (Student s : ts) {
			System.out.println(s);
		}
	}

}
