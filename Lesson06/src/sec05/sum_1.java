package sec05;

public class sum_1 {

	void powerOn() {
		System.out.println("1~10을 더합니다.");
	}
	
	void powerOff() {
		System.out.println("계산이 완료되었습니다.");
	}
	
	int sum(int[] arr) {
		int result = 0;
		
		for(int i =0; i<arr.length; i++) {
			 result += arr[i];
		}
		
		return result;
	}
	
	int sum2(int ... arr) {
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
}
