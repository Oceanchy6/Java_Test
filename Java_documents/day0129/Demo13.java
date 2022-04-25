/*
接口与接口之间关系：继承关系。
要注意细节：
	1. 一个接口是可以继承多个接口。
*/
 
interface A{
 
	public void print();
}
 
interface C{
 
	public void toString(int[] arr);
}
 
 
interface B extends A ,C{
 
	public void test();
}
 
 
class Demo13 implements B {
 
	public void test(){}
 
	public void print(){}
 
	public void toString(int[] arr){}
 
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
