package dS;

public class Traverse {
	public static void main(String[] args) {
		ListNode l=new ListNode("abc");
		ListNode l1=new ListNode("def");
		ListNode l2=new ListNode("ghi");
		
		MyLinkList mll=new MyLinkList();
		mll.add(l);
		mll.add(l1);mll.add(l2);
		
		ListNode head=mll.getHead();
		while(head!=null) {
			System.out.println(head.getData());
			head=head.getNext();
		}
	}
}
