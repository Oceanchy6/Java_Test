import java.util.Scanner;
//import java.lang.Scanner;�Լ���Ĵ���
class Demo1_This{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		//System.out.print("������������� :");
		//String name=sc.nextInt();

		System.out.print("������������� :");
		int a=sc.nextInt();
		Person p1=new Person();
		p1.setName("�ο���");
		p1.setAge(a);
		System.out.println("���"+p1.getName()+",��������Ϊ"+p1.getAge());
	}
}

class Person{
	private String name;
	private int age;

	public void setAge(int age){
		if(age>0&&age<=100){
			this.age=age;
		}else{
			System.out.println("�����Ѿ����ʺ�����,��ػ��ǰ�");
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