package sec05;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student	s1 = new Student(18, "ȫ�浿", 2);
		Student s2 = new Student(19, "�̿���", 3);
		
		System.out.println("s1 ������ Student ��ü�� �����Ѵ�.");
		System.out.println("s2 ������ Student ��ü�� �����Ѵ�.");
		
		System.out.println(s1.age);
		System.out.println(s1.grade);
		System.out.println(s1.name);
		
		System.out.println(s2.age);
		System.out.println(s2.grade);
		System.out.println(s2.name);
		
		s1.study();
		s1.home();
	}

}
