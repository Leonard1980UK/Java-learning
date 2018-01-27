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
    // add element at the end
    void add(LinkedLIst llist, int uData){
        // if there is no element in list yet
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
    // add element after Nth place
    void addAffter(int index, int uData){

        Node newNode = new Node(uData);
        int counter = 1;
        Node node = head;
        while (counter < index && node != null){
            node = node.next;
            counter++;
        }
        if (node == null){
            System.out.println("Given index doesn't exist");
            return;
        }
        newNode.next = node.next;
        node.next = newNode;

    }

    public static void main(String[] args)
    {

        // instantiate a linked list class
        LinkedLIst llist = new LinkedLIst();

        System.out.println("How many integer do you want to put in?");
        Scanner sc = new Scanner(System.in);
        int nrOfElem = sc.nextInt();
        System.out.println("Add an integer to add our Linked List");

        for (int i = 0; i < nrOfElem;i++) {
            llist.add(llist, sc.nextInt());
        }
        System.out.println("After which element, you would like to add the new element");
        int index = sc.nextInt();
        System.out.println("Please add new element");
        int data = sc.nextInt();

        llist.addAffter(index, data);
        llist.printList(llist.head);


    }
}
