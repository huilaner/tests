package algoProblems;

public class CircleMaxAbsDiff {
	public MyLinkedList L;
	public MyLinkedList R;
	public int max;
	public int min;
	
	public MyLinkedList generateCircleLists(int[] ary){
		MyLinkedList r = new MyLinkedList(ary[0]);
		MyLinkedList p = r;
		for(int i = 1; i < ary.length; i++){
			MyLinkedList temp = new MyLinkedList(ary[i]);
			p.setNext(temp);
			p = p.next;
		}
		p.next = r;
		return r;
	}
	
	//assume no duplicate
	public void getMaxAbsDiff(MyLinkedList lists, int count){
		MyLinkedList p = lists;
		count = 2*count -1;
		int currSum = 
		while(lists.visited <= 2 && count >=0){
//			System.out.print(p.val+"->");
			
			p.visited++;
			p = p.next;	
			count--;
		}
	}
	
	
	public static void main(String[] args){
		int[] ary = {1,2,3,4,5};
		CircleMaxAbsDiff c = new CircleMaxAbsDiff();
		MyLinkedList myList = c.generateCircleLists(ary);
//		myList.print();
		c.getMaxAbsDiff(myList,5);
	}
}
