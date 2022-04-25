class Test_01306 {
	public static void main(String[] args) {
		Outer.Inner oi=new Outer().new Inner();
		oi.print();
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
		new Inter(){
			public void print(){
				System.out.println("我是继承了接口的匿名内部类(特殊的局部内部类)");	
		}
	}.print();//需要 ';'
}
}