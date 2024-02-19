package sec05;

public class carExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		System.out.println("모델명 : "+myCar.model);
		System.out.println("시동여부 : "+myCar.start);
		System.out.println("속도 : "+myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도 : "+myCar.speed);
	}

}
