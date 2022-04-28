package example;

public class linkedList {
     Node head;
	 class Node
	 {
		 int data;
		 Node next;
		 Node(int value)
		 {
			 data=value;
			 next=null;
		 }
	 }
	  //Constructor
	 linkedList()
	 {
         head=null;
	 }
	 public void insertAtBeginning(int value)
	 {
		 Node newNode=new Node(value);
		 //when list is empty
		 if(head==null)
			 head=newNode;
		 //list is not empty
		 else
		 {
			newNode.next=head;
			head=newNode; 
		 }
			 
	}
	

	 //deletion
	public void deleteAtPos(int pos)
	{
		if(head==null)
		{
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		}
		
		Node temp=head;
		Node prev=null;
		//Jump till node to be deleted
		for(int i=1;i<=pos;i++)
		{
			prev=temp;//Keep track of prev node
			temp=temp.next;//Jump to next node
		}
		prev.next=temp.next;//reassign pointers
	}
	
	public void display()
	{
		Node temp=head;//start from head
		while(temp!=null)
		//null implies end of  null
		{
			System.out.print(temp.data +" ");
			temp=temp.next;//jump
		}

	}

    public static void main(String args[])
	{
		
		linkedList list=new linkedList();
		
        list.insertAtBeginning(12);
		list.insertAtBeginning(17);
		list.insertAtBeginning(10);
		list.insertAtBeginning(33);
		list.insertAtBeginning(5);
		list.insertAtBeginning(2);
		list.deleteAtPos(2);
		list.deleteAtPos(2);
		list.display();
	}
}





    

