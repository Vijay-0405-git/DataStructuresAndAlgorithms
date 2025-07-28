package com.DSA.LinkedLists;
import com.DSA.LinkedLists.LL;

public class mainlist {
	public static void main(String[] args) {
		LL list=new LL();
		list.insertFirst(12);
		list.insertFirst(23);
		list.insertLastWithTail(13);
		list.insertLastWithOutTail(78);
		list.Display();
		//System.out.println(list.deleteFirst());
		//list.deleteLast();
		list.ReverseList();
		list.Display();
		System.out.println(list.getTail());
		System.out.println(list.getMid());
	}
  


}
