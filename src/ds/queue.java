package ds;
import java.util.*;
public  class queue {
	 int front,rear,size=1000,arr[];
	queue(int k)
	{
	front=-1;
	 rear=-1;
	 arr=new int[k];
	}
	public void Enqueue(int y)
	{
		if(front==-1)
			front=0;
		if(rear > size-1)
		{
		System.out.println("overflow");
		return;
		}
		else
		{
			rear=rear+1;
			arr[rear]=y;
		System.out.println("Enqueue "+y);
	  }
			
	}
	public void Dequeue()
	{
		if(front>rear)
		{
		System.out.println("stack is empty");
	    return;
		}
		
		else
		{
			int y=arr[front++];
			System.out.println("Dequeued "+y);
		} 	
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	queue q=new queue(1000);
	for(int i=0;i<n;i++)
	{
		int k=sc.nextInt();
		q.Enqueue(k);
	}  
	q.Dequeue();q.Dequeue();q.Dequeue();q.Dequeue();q.Dequeue();q.Dequeue();q.Dequeue();q.Dequeue();
         sc.close();   	
   	}
	}
