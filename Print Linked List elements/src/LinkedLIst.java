import java.lang.*;
import java.io.*;

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



    public static void main(String[] args)
    {
        // instantiate a linked list class
        LinkedLIst llist = new LinkedLIst();


    }
}
