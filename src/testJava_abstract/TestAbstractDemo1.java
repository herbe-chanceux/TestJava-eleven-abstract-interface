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
		return "学生---姓名"+this.name+"年龄："+this.age+"职业："+this.occupation;
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
		return "工人---姓名"+this.name+"年龄："+this.age+"职业："+this.occupation;
	}
}
public class TestAbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student("张三", 24,"学生");
		Worker w=new Worker("李四", 32,"工人");
		System.out.println(s.talk());
		System.out.println(w.talk());
	}

}
