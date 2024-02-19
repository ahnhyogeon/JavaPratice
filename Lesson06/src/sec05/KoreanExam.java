package sec05;

public class KoreanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("안철수", 65, "213233-123123");
		Korean k2 = new Korean("이영자", 40, "123123-212311");
		
		System.out.println(k1.name);
		System.out.println(k1.age);
		System.out.println(k1.ssn);
		System.out.println(k1.nation);
		
		System.out.println(k2.name);
		System.out.println(k2.age);
		System.out.println(k2.ssn);
		System.out.println(k2.nation);
		

	}

}
