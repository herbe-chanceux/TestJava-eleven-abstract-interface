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
		return "����---����:"+this.name+",���䣺"+this.age+",ְҵ��"+this.occupation;
	}
}
class Leader extends Person{
	public Leader(String name,int age,String occupation){
		super(name,age,occupation);
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "�ɲ�---����:"+this.name+",���䣺"+this.age+",ְҵ��"+this.occupation;
	}
	
}
public class testJava_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Worker w=new Worker("������", 20, "�ɲ�");
		Leader l=new Leader("��С��", 30, "����");
		System.out.println(w.talk());
		System.out.println(l.talk());
		}

}
