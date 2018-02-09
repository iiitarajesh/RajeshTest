package dS;

public class MyLinkList {
	private ListNode head;

	public MyLinkList() {
		super();
		head = null;
	}

	public ListNode getHead() {
		return head;
	}

	public void setHead(ListNode n) {
		head = n;
	}
	
	public void add(Object obj) {
		if(getHead()==null) {
			ListNode ln=new ListNode(obj);
			ln.setNext(getHead());
			setHead(ln);
		}else {
			add(getHead(),obj);
		}
	}
	
	public void add(ListNode curr, Object obj) {
		if(curr.getNext()==null) {
			ListNode ln=new ListNode(obj);
			ln.setNext(curr.getNext());
			curr.setNext(ln);
		}else {
			add(curr.getNext(),obj);
		}
	}
}
