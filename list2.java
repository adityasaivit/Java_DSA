class list2
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

	public static node head;
	public static node tail;


	public void addfirst(int data)
	{
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

	public void addlast(int data)
	{
		node newnode=new node(data);
		tail.next=newnode;
		tail=newnode;

	}

	public void removefirst()
	{
		if(head==null)
		{
			System.out.println("empty");
		}
		else{
			head=head.next;

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
	}

	public boolean iscycle()
	{
		node slow=head;
		node fast=head;

		while(fast.next!=null && fast.next!=null)
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
	public void removecycle()
	{

		node slow=head;
		node fast=head;

		while(fast.next!=null && fast.next!=null)
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
		list2 l=new list2();

		l.addfirst(1);
		l.addfirst(2);
		l.addlast(3);
		l.addlast(4);
		l.print();
		l.addlast(8);
		l.addlast(7);
		l.addlast(6);

		node temp=head;
		for(int i=1;i<=2;i++)
		{
			temp=temp.next;
		}

		tail.next=temp;
		System.out.println(l.iscycle());

		l.removecycle();
		System.out.println(l.iscycle());


	}
}