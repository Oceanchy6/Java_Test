class Test_01292 {
	public static void main(String[] args) {
		Cat c=new Cat("小花",2);
		System.out.println(c.getName()+ "-----"+c.getAge());
		Dog d=new Dog("小黄",3);
		System.out.println(d.getName()+ "------"+d.getAge());
	}
}
abstract class Animal{
	private String name;
	private int age;
	
	public Animal(){}			//空参构造
	public Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setName(int age){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public abstract void eat();
}

class Cat extends Animal{
	public Cat(){}
	public Cat(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("猫吃鱼");
	}
}
class Dog extends Animal{
	public Dog(){}
	public Dog(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("狗吃肉");
	}
}