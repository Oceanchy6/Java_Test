class Test_01307 {
	public static void main(String[] args) {
		Outer o=new Outer();
		o.method();
	}
}
interface Inter{
	void show1();
	void show2();
}
class Outer{
	public void method(){
		/*new Inter(){
			public void show1(){
				System.out.println("我是继承接口的匿名内部类中的第一个方法");
			}
			public void show2(){
				System.out.println("我是继承接口的匿名内部类中的第二个方法");
			}
		}.show1();
		new Inter(){
			public void show1(){
				System.out.println("我是继承接口的匿名内部类中的第一个方法");
			}
			public void show2(){
				System.out.println("我是继承接口的匿名内部类中的第二个方法");
			}
		}.show2();*/
		Inter i=new Inter(){
			public void show1(){
				System.out.println("我是继承接口的匿名内部类中的第一个方法");
			}
			public void show2(){
				System.out.println("我是继承接口的匿名内部类中的第二个方法");
			}
		};
		i.show1();
		i.show2();

	}
}
