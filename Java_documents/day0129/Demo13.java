/*
�ӿ���ӿ�֮���ϵ���̳й�ϵ��
Ҫע��ϸ�ڣ�
	1. һ���ӿ��ǿ��Լ̳ж���ӿڡ�
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
