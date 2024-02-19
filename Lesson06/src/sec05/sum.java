package sec05;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum_1 arr = new sum_1();
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		int rs = arr.sum(nums);
		
		System.out.println(rs);
		
		int rs2 = arr.sum2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(rs2);
		
		
	}

}
