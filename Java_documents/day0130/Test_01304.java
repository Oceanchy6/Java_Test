class Test_01304 {
	public static void main(String[] args) {
		Outer o=new Outer();
		o.call();
	}
}
class Outer{
		public void call(){
			final int num=10;//从内部类中访问局部变量 num；需要被声明为最终类型
			class Inner{
				public void print(){
					System.out.println("我是局部内部类"+"\n"+num);

				}
			}
		Inner i=new Inner();
		i.print();
		}
	}
