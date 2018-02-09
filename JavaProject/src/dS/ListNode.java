package dS;

public class ListNode {
	Object data;
	ListNode next;

	public ListNode(Object data) {
		super();
		this.data = data;
		next = null;
	}

	public ListNode(Object data, ListNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "ListNode [data=" + data + "]";
	}
	
	

}
