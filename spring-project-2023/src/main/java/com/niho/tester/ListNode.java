package com.niho.tester;

public class ListNode {
	int val;
	ListNode next;

	ListNode() { }

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public String toString() {
		String result = val + " ";
		if (next != null) {
			result += next.toString();
		}
		return result;
	}

	// single-way linked list
	public ListNode reverse(ListNode head) {
		//head= 1.2.3
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
	}

	public ListNode findMiddle(ListNode head) {
	    ListNode fast = head;
	    ListNode slow = head;
	    while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    return slow;
	}
	
}
