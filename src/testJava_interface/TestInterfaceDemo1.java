package testJava_interface;
//�ӿ�������ݳ�Ա�����ʼ���������ݳ�Ա��Ϊ������
//�ӿ���ķ�������ȫ��������abstract��������Ϊ���󷽷���
//���󷽷��Ĺؼ���abstract����ʡ�ԣ����ݳ�Ա�Ĺؼ���finalҲ��ʡ��
interface Person{
	String name="����";
	int age=21;
	String occupation="ѧ��";
	public abstract String talk();
}
class Student implements Person{
	public String talk(){
		return "ѧ��---����"+this.name+"���䣺"+this.age+"ְҵ��"+this.occupation;
	}
}
public class TestInterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		System.out.println(s.talk());
	}

}
