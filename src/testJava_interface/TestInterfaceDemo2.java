package testJava_interface;
//�ӿ���ӿ�֮���ǿ��Լ̳еģ����ҿ��Խ��ж�̳У���������ǲ�ͬ��
interface A{
	int i=10;
	public void sayI();
}
interface E{
	int x=40;
    public void sayE();
}
interface B extends A,E{
	int j=20;
	public void sayJ();
}
class C implements B{
	public void sayI(){
		System.out.println("i="+i);
	}
	public void sayJ(){
		System.out.println("j="+j);
	}
	public void sayE(){
		System.out.println("e="+x);
	}
}
public class TestInterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c=new C();
		c.sayI();
		c.sayJ();
	}

}
