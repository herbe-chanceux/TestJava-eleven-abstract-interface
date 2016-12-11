package testJava_interface;
//接口里的数据成员必须初始化，且数据成员均为常量；
//接口里的方法必须全部声明成abstract，即必须为抽象方法。
//抽象方法的关键字abstract可以省略，数据成员的关键字final也可省略
interface Person{
	String name="张三";
	int age=21;
	String occupation="学生";
	public abstract String talk();
}
class Student implements Person{
	public String talk(){
		return "学生---姓名"+this.name+"年龄："+this.age+"职业："+this.occupation;
	}
}
public class TestInterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		System.out.println(s.talk());
	}

}
