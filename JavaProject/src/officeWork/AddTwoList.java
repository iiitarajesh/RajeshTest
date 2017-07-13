package officeWork;

/*You are given two non-empty linked lists representing two non-negative integers.
 *  The digits are stored in reverse order and each of their nodes contain a single digit.
 *   Add the two numbers and return it as a linked list.
 *   You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *   Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *   Output: 7 -> 0 -> 8
 
 */

public class AddTwoList {
	static Node head1;
	static Node head2;

	static class Node {
		int val;
		Node next;

		Node(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		AddTwoList lList = new AddTwoList();
		lList.head1 = new Node(7);
		lList.head1.next = new Node(5);
		lList.head1.next.next = new Node(9);
		lList.head1.next.next.next = new Node(4);
		lList.head1.next.next.next.next = new Node(6);

		lList.head2 = new Node(8);
		lList.head2.next = new Node(4);

		lList.printList(head1);
		lList.printList(head2);
		Node res = lList.addTwoNumbers(head1, head2);
		lList.printList(res);

	}

	public void printList(Node head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println("");
	}

	public Node addTwoNumbers(Node first, Node second) {
		Node temp = null, res = null, prev = null;
		int sum, carry = 0;
		while (first != null || second != null) {
			sum = carry + (first != null ? first.val : 0) + (second != null ? second.val : 0);
			carry = (sum >= 10) ? 1 : 0;
			sum = sum % 10;
			temp = new Node(sum);
			if (res == null) {
				res = temp;
			} else {
				prev.next = temp;
			}
			prev = temp;
			if (first != null) {
				first = first.next;
			}
			if (second != null) {
				second = second.next;
			}
		}
		if (carry > 0) {
			temp.next = new Node(carry);
		}
		return res;
	}
}
