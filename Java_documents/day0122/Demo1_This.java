import java.util.Scanner;
//import java.lang.Scanner;自己打的代码
class Demo1_This{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		//System.out.print("请输入你的名字 :");
		//String name=sc.nextInt();

		System.out.print("请输入你的年龄 :");
		int a=sc.nextInt();
		Person p1=new Person();
		p1.setName("任俊宇");
		p1.setAge(a);
		System.out.println("你叫"+p1.getName()+",今年年龄为"+p1.getAge());
	}
}

class Person{
	private String name;
	private int age;

	public void setAge(int age){
		if(age>0&&age<=100){
			this.age=age;
		}else{
			System.out.println("地球已经不适合你了,快回火星吧");
		}
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name=name;
	}	
	public String getName(){
		return name;
	}	
}