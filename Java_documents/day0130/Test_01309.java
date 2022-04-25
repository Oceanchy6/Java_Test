//要求控制台输出Hello World!
class Test_01309 {
	public static void main(String[] args) {
		Outer.method().show();//链式方法
	}
}
//也可以是抽象类
interface Inter{
	void show();
}
class Outer{
	public static Inter method(){		//之所以加上static,是因为Outer.method()直接类名.方法名说明方法是静态的
		return new Inter(){				//之所以加上Inter,是因为Outer.method()后面加.方法名说明Outer.method()也是对象名
			 public void show(){                        //,说明其是匿名内部类			
				System.out.println("Hello World!");
			}
		};
	}
}