/*
接口与类之间的关系：实现关系.
要注意的细节：
	1. 非抽象类实现一个接口时，必须要把接口中所有方法实现。
	2. 一个类可以实现多个接口。
	疑问： java支持多实现，为什么不支持多继承呢？
	因为如果支持多继承的话，假设多个父类中有相同的成员，那么其子类就不搞清楚到底使用哪个父类的同名成员了.
	3.  抽象类实现接口的时候， 可以实现接口中的方法，也可以不实现接口中的方法。
接口与接口之间关系：
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
		System.out.println("A接口中的print方法....");
	}
 
	public void test(){}
 
 
 
	public static void main(String[] args) 
	{
		Demo12 d = new Demo12();
		d.print();
	}
}