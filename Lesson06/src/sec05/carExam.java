package sec05;

public class carExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		System.out.println("�𵨸� : "+myCar.model);
		System.out.println("�õ����� : "+myCar.start);
		System.out.println("�ӵ� : "+myCar.speed);
		
		myCar.speed = 60;
		System.out.println("������ �ӵ� : "+myCar.speed);
	}

}
