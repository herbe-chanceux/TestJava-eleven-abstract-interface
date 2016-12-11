package testJava_test;
abstract class Person{
    String name;
	int age;
	String occupation;
	public Person(String name,int age,String occupation){
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public abstract String talk();
}
class Worker extends Person{
	public Worker(String name,int age,String occupation){
		super(name,age,occupation);
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "工人---姓名:"+this.name+",年龄："+this.age+",职业："+this.occupation;
	}
}
class Leader extends Person{
	public Leader(String name,int age,String occupation){
		super(name,age,occupation);
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "干部---姓名:"+this.name+",年龄："+this.age+",职业："+this.occupation;
	}
	
}
public class testJava_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Worker w=new Worker("李乐乐", 20, "干部");
		Leader l=new Leader("王小六", 30, "工人");
		System.out.println(w.talk());
		System.out.println(l.talk());
		}

}
