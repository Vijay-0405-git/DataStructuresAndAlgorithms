package com.DSA.LinkedLists;
import com.DSA.LinkedLists.LL;

public class mainlist {
	public static void main(String[] args) {
		LL list=new LL();
		list.insertFirst(2);
		list.insertFirst(1);
		list.insertLastWithTail(3);
		list.insertLastWithOutTail(3);
		list.insertLastWithOutTail(2);
		list.insertLastWithOutTail(1);
		list.Display();
		//System.out.println(list.deleteFirst());
		//list.deleteLast();
		list.ReverseListWithNode(list.getMid());
		list.Display();
		System.out.println(list.getTail());
		
		System.out.println(list.getMid());
	}
  


}
