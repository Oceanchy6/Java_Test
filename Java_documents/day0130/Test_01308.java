/*
�����ڲ����ڿ����е�Ӧ��,������������
*/
/*class Test_01308 {
	public static void main(String[] args) {
		Inter i=new Inter();
		i.test(new Demp());
	}
}
//�����ǳ�������߽ӿ�
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
		System.out.println("��������,ͨ����������ָ���������ķ�����ֵ");
	}
 }*/
class Test_01308 {
	public static void main(String[] args) {
		Inter i=new Inter();
		i.test(new Demo(){
			public void print(){
				System.out.println("��������,ͨ����������ָ���������ķ�����ֵ");
	      }
        });
	}
}
//�����ǳ�������߽ӿ�
abstract class Demo{
	public abstract void print();
}
 class Inter{
	 public void test(Demo d){
		d.print();
	 }
 }

