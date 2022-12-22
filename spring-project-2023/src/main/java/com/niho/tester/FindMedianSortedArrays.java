package com.niho.tester;

public class FindMedianSortedArrays {

	/**
	 * 給定兩個大小爲 m 和 n 的有序數組 nums1 和 nums2。 
	 * 請你找出這兩個有序數組的中位數，並且要求算法的時間複雜度爲 O(log(m + n))。 
	 * 你可以假設 nums1 和 nums2 不會同時爲空。
	 * 
	 * @param: nums1 = [1, 2] ,nums2 = [3, 4]
	 * @return: (2 + 3)/2 = 2.5
	 */
	public static double run(int[] nums1, int[] nums2) {

		// 保證nums1不是最長的，時間複雜度可轉化爲O(log(Min(m, n)))
		int m = nums1.length;
		int n = nums2.length;

		if (m > n)
			return run(nums2, nums1);

		int i = 0, j = 0, imin = 0, imax = m, half = (m + n + 1) / 2;
		double maxLeft = 0, minRight = 0;
		while (imin <= imax) {
			i = (imin + imax) / 2; /* nums1[i, nums1.length)爲要分割的右半部分 */
			j = half - i; /* nums2[j, nums2.length)爲要分割的右半部分 */
			if (i < m && nums2[j - 1] > nums1[i]) /* nums1分割點此時需要右移 */
				imin = i + 1;
			else if (i > 0 && nums1[i - 1] > nums2[j]) /* nums1 分割點此時需要左移 */
				imax = i - 1;
			else {
				if (i == 0)
					maxLeft = (double) nums2[j - 1];
				else if (j == 0)
					maxLeft = (double) nums1[i - 1];
				else
					maxLeft = (double) Math.max(nums1[i - 1], nums2[j - 1]);
				break;
			}
		}
		if ((m + n) % 2 == 1)
			return maxLeft;

		if (i == m)
			minRight = (double) nums2[j];
		else if (j == n)
			minRight = (double) nums1[i];
		else
			minRight = (double) Math.min(nums1[i], nums2[j]);

		return (double) (maxLeft + minRight) / 2;
	}
}
