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
            size++;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    SingleLinkedList(){
        size=0;
    }

    public static void main(String[] args) {
        SingleLinkedList ll=new SingleLinkedList();

        // addFirst
        ll.addFirst(10);
        ll.addFirst(20);

        // addLast
        ll.addNodeLast(1);
        ll.printList();
        System.out.println("Size : "+ll.getSize());
        
        

    }
    private void printList(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    private void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null) {
            head = newNode;
            tail = newNode;
           
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    private void addNodeLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    private void addAtindex(int position, int data){
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

    private void deleteFirstNode(){
        if(head==null){
            System.out.println("No nodes in the list");
        }
        size--;
        head=head.next;
    }

    private void deleteLastNode(){
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
        size--;
        current.next=null;
        tail=current;
    }

    private int getSize(){
        return size;
    }
}