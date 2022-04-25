class Test_01305 {
	public static void main(String[] args) {
		Outer o=new Outer();
		o.method();
	}
}
interface Inter{
	void print();
}
class Outer{
	/*private*/ class Inner implements Inter{
		public void print(){
			System.out.println("我是继承了接口的内部类");
		}
	}

	public void method(){
		Inner i=new Inner();
		i.print();
	}
}