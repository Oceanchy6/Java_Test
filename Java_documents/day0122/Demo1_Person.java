/*
* A:���ำֵ���������
* B:private�ؼ����ص�
	* a:��һ��Ȩ�����η�
	* b:�������γ�Ա�����ͳ�Ա����
	* c:�������εĳ�Աֻ���ڱ����б�����
* C:������ʾ
	* ��װ��private��Ӧ�ã�
	* A:�ѳ�Ա������private����
	* B:�ṩ��Ӧ��getXxx()��setXxx()����
	* private�����Ƿ�װ��һ��������ʽ,����˵��װ����˽��
*/
import java.util.Scanner;
class Demo1_Person {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person p1 = new Person();
		p1.name = "����";			//�����������Բ���ֵ
		//p1.age = -17;				//�����������Բ���ֵ
		//p1.speak();					//������Ϊ
		System.out.println("�������������");
		int age1=sc.nextInt();
		p1.setAge(age1);

		System.out.println(p1.getAge());
	}
}

class Person {
	String name;					//����
	private int age;				//����
	
	public void setAge(int a) {		//��������
		if (a > 0 && a < 200) {
			age = a;
		}else {
			System.out.println("��ػ��ǰ�,�����ʺ���");
		}
		
	}

	public int getAge() {			//��ȡ����
		return age;
	}

	public void speak() {
		System.out.println(name + "..." + age);
	}
}