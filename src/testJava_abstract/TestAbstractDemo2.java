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
		super(name,age,occupation);//用super明确调用抽象类（父类）中的构造方法
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "学生---姓名"+this.name+"年龄："+this.age+"职业："+this.occupation;
	}
}

public class TestAbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1("张三", 24,"学生");
		System.out.println(s.talk());
	}

}
