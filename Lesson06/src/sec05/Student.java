package sec05;

public class Student {
	//�ʵ� : ��ü�� �����Ͱ� ����Ǵ� ��
	int age;
	String name;
	int grade;
	
	//������ : Student(){} : ��ü ���� �� �ʱ�ȭ ���� ���
	Student(int age, String name, int grade){
		this.age = age;
		this.name = name;
		this.grade = grade;
	}
	//�޼ҵ� : ��ü�� �������� ȣ��� ����Ǵ� ��
	public void study() {
		System.out.println("�����ð����� ���θ� ������ �սô�.");
	}
	public void home() {
		System.out.println("������ ������ ���� ���ϴ�.");
	}
}
