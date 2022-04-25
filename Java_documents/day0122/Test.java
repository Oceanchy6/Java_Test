/*
JDK 中Date类的使用

*/
import java.util.Date;
class Test {
	public void showDate(Date d){
		System.out.println(d);
	} 

	public static void main(String[] args) {
		Test t=new Test();
		Date d=new Date();
		t.showDate(d);
		//int b=24;
		int a=d.getDate();
		System.out.println(a);
	}
}
