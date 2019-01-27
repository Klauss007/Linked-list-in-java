import java.io.*;
import java.util.*;
class Linked_list{

	Node first;
	static class Node{
		int data;
		Node next;

		public Node(int data)
		{
			this.data = data;
			next = null;
		}
	}

	public static Node insert_rear(Node first,int elem)
	{
		Node temp = new Node(elem);
		//front.next = null;

		if(first == null)
		{

			return temp;
		}
		else
		{
			Node cur = first;
			while(cur.next != null)
			{
				cur = cur.next;
			}
			cur.next = temp;
		}
		return first;
	}

	public static Node insert_front(Node first,int elem)
	{
		Node temp = new Node(elem);
		temp.next = first;
		first = temp;
		return temp;
	}

	public static void display(Node first)
	{
		Node curnode = first;
		if(curnode == null)
		{
			System.out.println("list empty");
			return;
		}
		while(curnode != null)
		{
			System.out.println(curnode.data +" ");
			curnode = curnode.next;
		}
	}

	public static Node deletefront(Node first)
	{
		Node temp = first ;
		if(first == null)
		{
			System.out.println("list empty");
			return first;
		}
		//temp = list.head;
		first = temp.next;
		System.out.println("deleted element is : "+temp.data);
		return first;
	}

	public static Node delete_rear(Node first)
	{
		Node temp,cur;
		if(first == null)
		{
			System.out.println("list is empty");
			return first;
		}
		if(first.next == null)
		{
			System.out.println("element deleted is : "+ first.data);
			return null;
		}
		temp = first;
		cur = temp.next;
		while(cur.next != null)
		{
			temp = cur;
			cur = cur.next;
		}
		temp.next = null;
		System.out.println("element deleted is : "+cur.data);
		return first;
	}

	public static void main(String args[])
	{
		int choice,data;
		Scanner sc = new Scanner(System.in);
		Linked_list list = new Linked_list();
		for(;;)
		{
			System.out.println("enter your choice :");
			System.out.println("1.insert_front \n2.insert_rear \n3.delete_front \n4.delete_rear \n5.display \n6.exit");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1: System.out.println("enter the element: ");
						data = sc.nextInt(); 
						list.first = insert_front(list.first,data);
				break;

				case 2: System.out.println("enter the element: ");
						data = sc.nextInt();
						list.first = insert_rear(list.first,data);
				break;

				case 3: list.first = deletefront(list.first);
				break;

				case 4: list.first = delete_rear(list.first);

				case 5: display(list.first);
				break;

				case 6:System.exit(0);
			}
		}
	}
}