class Abstract {
	public static void main(String[] args) {
		Person a=new Chy();
		a.call();
		a.method();
	}
}

abstract class Person{
	public  abstract void call();

	public void method(){
		System.out.println("啥都不会");
	}
}
class Chy extends Person{
	public Chy(){
		System.out.println("我是陈海洋大帅哥");
	}
	public void call(){
		System.out.println("你是任俊宇野猪");
	}
	
}
