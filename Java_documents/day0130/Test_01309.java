//Ҫ�����̨���Hello World!
class Test_01309 {
	public static void main(String[] args) {
		Outer.method().show();//��ʽ����
	}
}
//Ҳ�����ǳ�����
interface Inter{
	void show();
}
class Outer{
	public static Inter method(){		//֮���Լ���static,����ΪOuter.method()ֱ������.������˵�������Ǿ�̬��
		return new Inter(){				//֮���Լ���Inter,����ΪOuter.method()�����.������˵��Outer.method()Ҳ�Ƕ�����
			 public void show(){                        //,˵�����������ڲ���			
				System.out.println("Hello World!");
			}
		};
	}
}