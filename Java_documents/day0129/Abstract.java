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
		System.out.println("ɶ������");
	}
}
class Chy extends Person{
	public Chy(){
		System.out.println("���ǳº����˧��");
	}
	public void call(){
		System.out.println("�����ο���Ұ��");
	}
	
}
