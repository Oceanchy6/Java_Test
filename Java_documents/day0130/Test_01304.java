class Test_01304 {
	public static void main(String[] args) {
		Outer o=new Outer();
		o.call();
	}
}
class Outer{
		public void call(){
			final int num=10;//���ڲ����з��ʾֲ����� num����Ҫ������Ϊ��������
			class Inner{
				public void print(){
					System.out.println("���Ǿֲ��ڲ���"+"\n"+num);

				}
			}
		Inner i=new Inner();
		i.print();
		}
	}
