class Test_01293 {
	public static void main(String[] args) {
		//Demo1 d=new Demo1();
		//System.out.println(d.num);
		//d.speak();
	}
}
interface Demo{
	/*public static final */int num =10;
	public abstract void speak();
	public void print();
}
class Demo1 implements Demo{
	//int num=20;
	public void speak(){
		//num=20;
		System.out.println("我是接口的子类"+num);
	}	
	public void print(){}
}
