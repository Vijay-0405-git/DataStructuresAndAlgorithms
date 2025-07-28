package com.DSA.LinkedLists;

public class LL {
	
	public void insertFirst(int val) {
		Node node=new Node(val);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=node;
		}
		size++;
	
	}
	
	public void insertLastWithTail(int val) {
		Node node=new Node(val);
		tail.next=node;
		tail=node;
		size++;
	}
	
	public void insertLastWithOutTail(int val) {
		Node node=new Node(val);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
		tail=node;
		size++;
		
	}
	
	public void Display() {
		Node temp=head;
		System.out.print("Start -> ");
		while(temp!=null) {
			System.out.print(temp.val +" -> ");
			temp=temp.next;
		}
		System.out.print("End");
		System.out.println();
	}
	
	public void insertAtTheIndex(int pos,int val) {
		if(pos==size) {
			insertLastWithOutTail(val);
		}
		else if (pos==1) {
			insertFirst(val);
		}
		else {
			Node node=new Node(val);
			Node temp=head;
			int start=1;
			while(start<pos) {
				temp=temp.next;
				start++;
			}
			Node sec=temp.next;
			temp.next=node;
			node.next=sec;
		}
	}
	public int deleteFirst() {
		int val=head.val;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return val;
	}
	public void ReverseList() {
		if(size<2) {
			return;
		}
		Node prev=null;
		Node pres=head;
		Node nex=pres.next;
		while(pres!=null) {
			pres.next=prev;
			prev=pres;
			pres=nex;
			if(nex!= null) {
				nex=nex.next;
			}
			
		}
		head=prev;
	}
	public void deleteLast() {
		Node temp=head;
		while(temp.next.next!= null) {
			temp=temp.next;
		}
		temp.next=null;
		tail=temp;
		
	}
	private Node head;
	private Node tail;
	
	private int size;
	public LL() {
		this.size=0;
	}
	
	private class Node{
		private int val;
		private Node next;
		
		public Node(int val) {
			this.val=val;
		}
		public Node(int val,Node next) {
			this.val=val;
			this.next=next;
		}
	}
	public int getTail() {
		return tail.val;
	}
	public int getMid() {
		int m=size/2;
		Node temp=head;
		for (int i=1;i<m;i++) {
			temp=temp.next;
		}
		return temp.val;
	}
	

}
