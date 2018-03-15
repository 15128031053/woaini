package org.aptech.maven01;

public class Welcome{
	public static void main(String[] args){
		int[] nums = {14,20,4,2,28,90,43};

		for(int num : nums){
			System.out.print(num + " ");
		}
		System.out.println();

		for(int i = 0; i < nums.length - 1; i++){
			for (int j = 0; j < nums.length - 1 - i;j++ ) {
				if (nums[j] > nums[j+1]) {
					int tem = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tem;
				}
			}

		}

		for(int num : nums){
			System.out.print(num + " ");
		}
		System.out.println();
	}
}