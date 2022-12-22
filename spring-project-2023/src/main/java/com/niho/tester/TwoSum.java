package com.niho.tester;

public class TwoSum {

	/**
	 * @param: nums = [2,7,11,15], target = 9
	 * @return: [0,1] Because nums[0] + nums[1] == 9, we return [0, 1].
	 */
	public static int[] run(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = nums[i] + nums[j];
				if (sum == target) {
					int[] result = { i, j };
					return result;
				}
			}
		}
		return null;
	}
}
