class Test_01307 {
	public static void main(String[] args) {
		Outer o=new Outer();
		o.method();
	}
}
interface Inter{
	void show1();
	void show2();
}
class Outer{
	public void method(){
		/*new Inter(){
			public void show1(){
				System.out.println("���Ǽ̳нӿڵ������ڲ����еĵ�һ������");
			}
			public void show2(){
				System.out.println("���Ǽ̳нӿڵ������ڲ����еĵڶ�������");
			}
		}.show1();
		new Inter(){
			public void show1(){
				System.out.println("���Ǽ̳нӿڵ������ڲ����еĵ�һ������");
			}
			public void show2(){
				System.out.println("���Ǽ̳нӿڵ������ڲ����еĵڶ�������");
			}
		}.show2();*/
		Inter i=new Inter(){
			public void show1(){
				System.out.println("���Ǽ̳нӿڵ������ڲ����еĵ�һ������");
			}
			public void show2(){
				System.out.println("���Ǽ̳нӿڵ������ڲ����еĵڶ�������");
			}
		};
		i.show1();
		i.show2();

	}
}
