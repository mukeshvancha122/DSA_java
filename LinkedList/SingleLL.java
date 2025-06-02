import java.util.*;
/**
 * Single Linked List implementation in Java.
 */
class SingleLinkedList{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head;
    private Node tail;

    public static void main(String[] args) {
        SingleLinkedList ll=new SingleLinkedList();

        // addFirst
        ll.addFirst(10);
        ll.addFirst(20);

        // addLast
        ll.addNodeLast(1);
        ll.printList();
        
        

    }
    public void printList(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null) {
            head = newNode;
            tail = newNode;
           
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    public void addNodeLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void addAtindex(int position, int data){
        Node newNode=new Node(data);
        int index=0;
        Node current=head;
        while(current.next!=null & index< position-1){
            current=current.next;
            index++;
        }
        newNode.next=current.next;
        current.next=newNode;


    }

    public void deleteFirstNode(){
        if(head==null){
            System.out.println("No nodes in the list");
        }
        head=head.next;
    }

    public void deleteLastNode(){
        Node current=head;
        if(head==null){
            System.out.println("No nodes in the list");
        }
        if(head.next==null){
            head=null;
        }
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        tail=current;
    }
}