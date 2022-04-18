package example;

public class Queue {
    class Node
    {
        int data;
        Node next;//next is the reference variable
        Node(int value)
        {
            data=value;
            next=null;
        }
    }
    Node front,rear;
    //constructor
    Queue()
    {
        front=null;
        rear=null;
    }
    //Adds the element
    public void enqueue(int value)
    {
        Node newNode=new Node(value);
        if(front==null)
        {
            front=newNode;
        }
        else
           rear.next=newNode;
        rear=newNode;
        
    }
    //Deletes the element
    public int dequeue()
    {
        if(front==null)
        {
            throw new IndexOutOfBoundsException("Queue is Empty");
        }
        int temp=front.data;
        front=front.next;
        
        if(front==null)//deleted last node and now Q is empty
             rear=null;
        return temp;
    }
    public boolean isEmpty()
    {
        return front==null;
    }
    //Returns data in front
    public int elementAtFront()
    {
        if(front==null)//no node in Q
        {
            throw new IndexOutOfBoundsException("Queue is Empty");
        }
        return front.data;
    }

    public static void main(String args[])
    {
        Queue queue=new Queue();

        queue.enqueue(5);
        queue.enqueue(9);
        queue.enqueue(8);
       
        System.out.println("dequeued:" + queue.dequeue());
        System.out.println("dequeued:" + queue.dequeue());
        System.out.println("dequeued:" + queue.dequeue());
        
    }
}


