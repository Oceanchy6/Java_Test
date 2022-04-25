/*
匿名内部类在开发中的应用,当做参数传递
*/
/*class Test_01308 {
	public static void main(String[] args) {
		Inter i=new Inter();
		i.test(new Demp());
	}
}
//可以是抽象类或者接口
abstract class Demo{
	public abstract void print();
}
 class Inter{
	 public void test(Demo d){
		d.print();
	 }
 }

 class Demp extends Demo{
	public void print(){
		System.out.println("我是子类,通过父类引用指向子类对象的方法传值");
	}
 }*/
class Test_01308 {
	public static void main(String[] args) {
		Inter i=new Inter();
		i.test(new Demo(){
			public void print(){
				System.out.println("我是子类,通过父类引用指向子类对象的方法传值");
	      }
        });
	}
}
//可以是抽象类或者接口
abstract class Demo{
	public abstract void print();
}
 class Inter{
	 public void test(Demo d){
		d.print();
	 }
 }

