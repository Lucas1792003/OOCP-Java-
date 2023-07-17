package exam;

public class Q11_6511171 {
	public static boolean haveFour(int[] nums) {
		int count =0;
		for (int i = 0; i< nums.length-1;i++) {
			if (nums[i]==4 && nums[i+1]==4) {
				count=0;
			}
			else if (nums[i]==4) {
				count++;
			}
		}
		if (nums[nums.length-1]==4){
			count=count+1;
		}
		else {
			count=count;
		}
		if (count==4 ) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args){
		 int[] arr1 = {4};
		 int[] arr2 = {1,2,3,4};
		 int[] arr3 = {94,5,4,9,4,4};
		 int[] arr4 = {9,100,4,9,4,100,4,2,4,10};
		 int[] arr5 = {100,4,9,4,100,4,2,4,10,4};
		 int[] arr6 = {4,3,4,9,4,8,9,10,100,9,7,4};
		 int[] arr7 = {4,2,4,99,3,4,2,1,9,100,8,7,4,3,2};
		 System.out.println(haveFour(arr1)); // false
		 System.out.println(haveFour(arr2)); // false
		 System.out.println(haveFour(arr3)); // false
		 System.out.println(haveFour(arr4)); // true
		 System.out.println(haveFour(arr5)); // false
		 System.out.println(haveFour(arr6)); // true
		 System.out.println(haveFour(arr7)); // true
		 }

}
