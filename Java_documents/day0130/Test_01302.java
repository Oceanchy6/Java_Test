class Test_01302 {
	public static void main(String[] args) {
		Outer.Inner oi=new Outer().new Inner();
		oi.print();
	}
}
class Outer{
	 int num=10;
	class Inner{
		//public int num=20;
		public void print(){
			//int num=30;
			//System.out.println(num);
			//System.out.println(this.num);
			System.out.println(/*Outer.this.*/num);
		}
	}
}
