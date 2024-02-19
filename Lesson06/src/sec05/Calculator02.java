package sec05;

public class Calculator02 {
	//필드 - 생략
	
	//생성자 - 기본생성자
	
	//메소드
	void powerOn(){
		System.out.println("전원을 켭니다.");
		
	}
	
	void powerOff(){
		System.out.println("전원을 끕니다.");
		
	}
	
	int plus(int x, int y){
		int result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x/y;
		return result;
	}
}	
