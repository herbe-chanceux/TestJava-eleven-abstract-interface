package testJava_abstract;

abstract class Person{
	String name;
	int age;
	String occupation;
	public abstract String talk();
}
class Student extends Person{
	public Student(String name,int age,String occupation){
		this.name =name;
		this.age=age;
		this.occupation=occupation;
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "ѧ��---����"+this.name+"���䣺"+this.age+"ְҵ��"+this.occupation;
	}
}
class Worker extends Person{
	public Worker(String name,int age,String occupation){
		this.name =name;
		this.age=age;
		this.occupation=occupation;
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "����---����"+this.name+"���䣺"+this.age+"ְҵ��"+this.occupation;
	}
}
public class TestAbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student("����", 24,"ѧ��");
		Worker w=new Worker("����", 32,"����");
		System.out.println(s.talk());
		System.out.println(w.talk());
	}

}
