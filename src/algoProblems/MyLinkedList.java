package algoProblems;

public class MyLinkedList {
	public int val;
	public MyLinkedList next;
	public int visited = 0;
	public MyLinkedList(int val){
		this.val = val;
	}
	public void setNext(MyLinkedList n){
		this.next = n;
	}
	
	
	public void print(){
		MyLinkedList p = this;
		while(p != null){
			System.out.print(p.val+"->");
			p = p.next;
		}
		System.out.println();
	}
}
