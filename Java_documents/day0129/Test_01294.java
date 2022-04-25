class Test_01294 {
	public static void main(String[] args) {
		Demo3 d=new Demo3();
		//System.out.println(d.num);
		d.speak1();
		d.speak2();
	}
}
interface Demo1{
	/*public static final */int num1 =1;
	/*public abstract*/ void speak1();
	//public void print();
}
interface Demo2{
	/*public static final */int num2 =2;
	/*public abstract*/ void speak2();
	//public void print();
}
interface Demo4 extends Demo1{
}
class Demo3 implements Demo1,Demo2{
	//int num=20;
	public void speak1(){
		//num=20;
		System.out.println("我是接口Demo1的子类"+num1);
	}	
	//public void print(){}
	public void speak2(){
		//num=20;
		System.out.println("我是接口Demo2的子类"+num2);
	}
}
