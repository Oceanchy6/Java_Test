class Test_01306 {
	public static void main(String[] args) {
		Outer.Inner oi=new Outer().new Inner();
		oi.print();
		Outer o=new Outer();
		o.method();
	}
}
interface Inter{
	void print();
}
class Outer{
	/*private*/ class Inner implements Inter{
		public void print(){
			System.out.println("���Ǽ̳��˽ӿڵ��ڲ���");
		}
	}

	public void method(){
		new Inter(){
			public void print(){
				System.out.println("���Ǽ̳��˽ӿڵ������ڲ���(����ľֲ��ڲ���)");	
		}
	}.print();//��Ҫ ';'
}
}