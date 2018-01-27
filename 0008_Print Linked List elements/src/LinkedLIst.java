import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class LinkedLIst {

    // declare head node with data 0
    private Node head;

    // node class
    class Node {
        int data;
        Node next;

        //constructor
        Node(int d){
            data = d;
            next = null;
        }
    }


    void printList(Node head)
    {
        if (head != null){
            System.out.print(head.data);
            Node n = head;
            while (n.next != null){
                n = n.next;
                System.out.print(" ");
                System.out.print(n.data);
            }
        }
    }

    void add(LinkedLIst llist, int uData){

        if (head == null){
            llist.head = new Node(uData);
        }else{
            Node node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new Node(uData);

        }
    }



    public static void main(String[] args)
    {
        // instantiate a linked list class
        LinkedLIst llist = new LinkedLIst();
        for (int i=0; i<5;i++) {
            System.out.println("Add an integer to add our Linked List");
            Scanner sc = new Scanner(System.in);
            llist.add(llist, sc.nextInt());
        }

//        llist.addBefore(llist, 3, 888);
        llist.printList(llist.head);


    }
}
