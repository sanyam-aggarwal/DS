package ds;
public class Linkedlist
{
	Node head;
	void add(int data)
	{
		Node toAdd=new Node(data);
		
		if(isEmpty())
		{
			head=toAdd;
			return;
		}
		
		Node temp=head;
		
		while(temp.next != null)
		{
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	void print()
	{
Node temp=head;
		
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}
	boolean isEmpty()
	{
		return head == null;
	}
	static class Node
	{
		int data;
		Node next;
		public Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public static void main(String[] args)
	{
		Linkedlist myll=new Linkedlist();
		myll.add(52);
		myll.add(12);
		myll.add(56);
		myll.add(45);
		myll.add(78);
		myll.print();
		
	}
}