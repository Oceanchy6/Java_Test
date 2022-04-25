package com.chy.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.chy.bean.Student;

public class Test7 {

	/**
	 * ����:��������5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨
	 * 
	 * ����:
	 * 1,����һ��ѧ����{
	 * 			��Ա����:����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�,�ܳɼ�
	 * 			��Ա����:�ղ�,�вι���,�вι���Ĳ����ֱ�������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�
	 * }
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ѧ���ɼ�:��ʽ����");
		System.out.println("����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
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
				System.out.println("��ʽ����,��ȷ�ĸ�ʽ��:����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
			}
			
		}
		System.out.println("������ѧ���ɼ�Ϊ:");
		for (Student s : ts) {
			System.out.println(s);
		}
	}

}
