package testJava_abstract;
abstract class Person1{
	String name;
	int age;
	String occupation;
	public Person1(String name,int age,String occupation){
		this.name =name;
		this.age=age;
		this.occupation=occupation;
	}
	public abstract String talk();
}
class Student1 extends Person1{
	public Student1(String name,int age,String occupation){
		super(name,age,occupation);//��super��ȷ���ó����ࣨ���ࣩ�еĹ��췽��
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "ѧ��---����"+this.name+"���䣺"+this.age+"ְҵ��"+this.occupation;
	}
}

public class TestAbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1("����", 24,"ѧ��");
		System.out.println(s.talk());
	}

}
