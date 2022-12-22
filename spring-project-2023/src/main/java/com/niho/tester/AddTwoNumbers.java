package com.niho.tester;

public class AddTwoNumbers {

	/**Dummy Node的使用多针对Single List没有前向指针的问题，保证链表的head不会在删除操作中丢失
	 * @param: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	 * @return: 7 -> 0 -> 8
	 * @Explanation: 342 + 465 = 807.
	 */
	public static ListNode run(ListNode l1, ListNode l2) {

		ListNode dummy = new ListNode(0);
		int sum = 0;
		int more = 0; // carry : no = 0 ; yes = 1
		ListNode nextNode = dummy;

		while (l1 != null || l2 != null || more > 0) {
			sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + more;
			more = sum / 10;
			sum %= 10;

			ListNode node = new ListNode(sum);
			nextNode.next = node; // link new node
			nextNode = node; // 當前節點往後移

			l1 = (l1 == null) ? null : l1.next;
			l2 = (l2 == null) ? null : l2.next;
		} // 當循環結束 pre 指向最後一個節點

		nextNode = dummy; // 重新賦值讓其指向首節點
		return nextNode.next;
	}
}
