package sec05;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator02 cal = new Calculator02();
		
		cal.powerOn();
		
		int rs = cal.plus(143, 145);
		System.out.println("143 + 145 = "+rs);
		
		double rs2 = cal.divide(120, 15);
		System.out.println("120 / 15 = "+rs2);
		
		cal.powerOff();
		
	}

}
