/*
�ӿ�����֮��Ĺ�ϵ��ʵ�ֹ�ϵ.
Ҫע���ϸ�ڣ�
	1. �ǳ�����ʵ��һ���ӿ�ʱ������Ҫ�ѽӿ������з���ʵ�֡�
	2. һ�������ʵ�ֶ���ӿڡ�
	���ʣ� java֧�ֶ�ʵ�֣�Ϊʲô��֧�ֶ�̳��أ�
	��Ϊ���֧�ֶ�̳еĻ�������������������ͬ�ĳ�Ա����ô������Ͳ����������ʹ���ĸ������ͬ����Ա��.
	3.  ������ʵ�ֽӿڵ�ʱ�� ����ʵ�ֽӿ��еķ�����Ҳ���Բ�ʵ�ֽӿ��еķ�����
�ӿ���ӿ�֮���ϵ��
*/
 
interface A{
 
	public void print();
}
 
interface B{
 
	public void test();
 
}
 
 
abstract class C implements A ,B{
	
	public void print(){}
 
	public void test(){}
}
 
 
 
class Demo12 implements A , B{
	
	public void print(){
		System.out.println("A�ӿ��е�print����....");
	}
 
	public void test(){}
 
 
 
	public static void main(String[] args) 
	{
		Demo12 d = new Demo12();
		d.print();
	}
}