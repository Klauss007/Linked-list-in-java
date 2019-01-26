class Linked_list{
	Node head;
	static class Node{
		int data;
		Node next;

		public Node(int data)
		{
			this.data = data;
			next = null;
		}
	}

	public static Linked_list insert_front(Linked_list list,int elem)
	{
		Node node = new Node(elem);
		node.next = null;

		if(list.head == null)
		{
			list.head = node;
		}
		else
		{
			Node last = list.head;
			while(last.next != null)
			{
				last = last.next;
			}
			last.next = node;
		}
		return list;
	}

	public static void display(Linked_list list)
	{
		Node curnode = list.head;
		if(curnode == null)
		{
			System.out.println("list empty");
		}
		while(curnode != null)
		{
			System.out.println("")
			curnode = curnode.next;
		}
	}

	public static int deletefront(Linked_list list)
	{
		Node temp = list.head;
		if(temp == null)
		{
			System.out.println("list empty");
			System.exit(0);
		}
		temp = head;
		head = head.next;
		System.out.println("deleted element is : ")
	}

	public static void main(String args[])
	{
		int choice, data;
		System.out.println("enter your choice :");
		System.out.println("1.insert \n 2.display \n 3.display \n4.exit");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		Linked_list list = new Linked_list();
		for(;;)
		{
			Switch(choice)
			case 1: list = insert_front(list,elem);
			break;

			case 2: data = delete_front(list);
			break;

			case 3: display(list);
			break;

			case 4 :System.exit(0);
		}
	}
}