class linkedlistnew
{

	class node
	{
		int data;
		node next;
		public node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	public static int size=0;


	public static node head;
	public static node tail;

	public void addfirst(int data)
	{
		size++;
		node newnode=new node(data);
		if(head==null)
		{
			head=tail=newnode;
		}
		else
		{
			newnode.next=head;
			head=newnode;
		}
	}


	public void print()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}

	public void addlast(int data)
	{

		size++;
		node newnode=new node(data);
		tail.next=newnode;
		tail=newnode;
	}

	public void removefirst()
	{

		if(head==null)
		{
			System.out.println("linkedlist was empty");
		}
		else
		{
			head=head.next;
			size--;
		}

	}

	public void removelast()
	{
		node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;

		}
		temp.next=null;
		tail=temp;
		size--;

	}

	public void search(int n)
	{
		node temp=head;
		while(temp!=null)
		{
			if(temp.data==n)
			{
				System.out.println("found in the linked list");
			}
			temp=temp.next;
		}

	}


	// floyd cycle algorithm
	public boolean iscycle()
	{

		node slow=head;
		node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return true;
			}
		}
		return false;

	}

	public void removecycle()
	{
		node slow=head;
		node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				break;
			}
		}

		slow=head;
		
		while(slow.next!=fast.next)
		{
			slow=slow.next;
			
			fast=fast.next;
		}

		fast.next=null;
		
	}



	public static void main(String args[])
	{
		

		linkedlistnew l=new linkedlistnew();

		l.addfirst(1);
		l.print();
		l.addlast(2);
		l.print();
		l.removefirst();
		l.print();
		l.addfirst(1);
		l.addfirst(3);
		l.print();
		l.removelast();
		l.print();
		l.search(3);
		l.addfirst(1);
		l.addlast(2);
		l.addlast(3);
		l.addlast(4);
		l.addlast(5);
		l.print();
		l.search(3);

		// lets make a cycle

		node temp=head;
		for(int i=1;i<=3;i++)
		{
			temp=temp.next;
		}

		tail.next=temp;

		System.out.println(l.iscycle());

		l.removecycle();
		System.out.println(l.iscycle());





	}
}