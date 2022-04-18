package example;

public class Stack {
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
    Node top;
    //constructor
    Stack()
    {
        top=null;
    }
    //push operation
    public void  push(int value)
    {
        Node newNode=new Node(value);
        newNode.next=top;
        top=newNode;

    }
    //pop operation
    public int pop()
    {
        if(top==null)
        {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        int temp=top.data;
        top=top.next;
        return temp;
    }
    public boolean isEmpty()
    {
        return top==null;//empty
    }
    public int peek()
    {
        return top.data;
    }

    public static void main(String args[])
    {
        Stack stack=new Stack();
        stack.push(7);
        stack.push(15);
        stack.push(20);
        stack.push(5);
        System.out.println("popped"+stack.pop());
    }

    
}

