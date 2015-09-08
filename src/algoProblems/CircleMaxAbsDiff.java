package algoProblems;

public class CircleMaxAbsDiff {
	
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
	public int getMaxAbsDiff(MyLinkedList lists, int count){
		MyLinkedList p = lists;
		count = 2*count -1;
		int[] diffAry = new int[count-1];
		for(int i = 0; i < count-1; i++){
			System.out.print(p.val+"->");
			diffAry[i] = p.val - p.next.val;
			p = p.next;
		}
		System.out.println(p.val);
		int currPos = 0; int currNeg = 0;
		int maxSum = 0; int minSum = 0;
		//find max pos
		for(int i = 0; i < count-1; i++){
			if(diffAry[i] > 0) currPos += diffAry[i];
			else currPos = 0;
			if(currPos > maxSum) maxSum = currPos;
		}
		//find min neg
		for(int i = 0; i < count-1; i++){
			if(diffAry[i] < 0) currNeg += diffAry[i];
			else currNeg = 0;
			if(currNeg < minSum) minSum = currNeg;
		}
		
		for(int i = 0; i < count-1; i++){
			System.out.print(diffAry[i]+",");
		}
		System.out.println();
		System.out.println("pos:"+maxSum+" neg:"+minSum);
		return Math.max(Math.abs(maxSum), Math.abs(minSum));
		
	}
	
	
	public static void main(String[] args){
		System.out.println("#test1");
		int[] ary = {1,2,3,4,5};
		CircleMaxAbsDiff c = new CircleMaxAbsDiff();
		MyLinkedList myList = c.generateCircleLists(ary);
		int r = c.getMaxAbsDiff(myList,ary.length);
		System.out.println("result:"+r);
		
		System.out.println("\n#test2");
		int[] ary2 = {2,3,100};
		CircleMaxAbsDiff c2 = new CircleMaxAbsDiff();
		MyLinkedList myList2 = c.generateCircleLists(ary2);
		int r2 = c.getMaxAbsDiff(myList2,ary2.length);
		System.out.println("result:"+r2);
		
		System.out.println("\n#test3");
		int[] ary3 = {3,6,100,50,60};
		CircleMaxAbsDiff c3 = new CircleMaxAbsDiff();
		MyLinkedList myList3 = c.generateCircleLists(ary3);
		int r3 = c3.getMaxAbsDiff(myList3,ary3.length);
		System.out.println("result:"+r3);
	}
}
