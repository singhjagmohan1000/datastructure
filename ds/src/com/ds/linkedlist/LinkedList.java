package com.ds.linkedlist;

/**
 * Created by Gaggi on 2/26/17.
 */
import java.util.*;
public class LinkedList {

    private Node start;
    private Node end;
    public LinkedList (){
        this.start=null;
    }

    public Boolean ifEmpty(){

        if(start==null)
            return true;
        else
            return false;
    }
    public void traverse(){
        if(ifEmpty()){
            System.out.println("List is Empty");
        }
        else{
            Node node=start;
            while(node.getNext()!=null){
                System.out.print(" "+node.getData());
            node=node.getNext();
            }
            System.out.println(" "+node.getData());
        }

    }
    public int sizeOfLinkedList(){
        Node node=start;
        int count=1;
        if(ifEmpty()){
            return 0;
        }
        else {
            while (node.getNext() != null) {
                node = node.getNext();
                count++;
            }
        return count;
        }
    }
    public void addLinkAtStart(int data){
        Node node=new Node(data,null);
        if(ifEmpty()){
            start=node;
            end=node;
        }
        else{
          node.setNext(start);
          start=node;

        }

    }
    public void addLinkAtEnd(int data){
        Node node=new Node(data,null);
        Node temp;
        if(ifEmpty()){
            start=node;
            end=node;
        }
        else{temp=start;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
            end=temp;

        }
    }
    public void addLinkAtPosition(int data,int pos){
        int n=sizeOfLinkedList();
        Node node=start;

        if(pos>n){
            System.out.println("Position is out of bound from size of list");
        }
        else{
            if(pos==1 || pos==0){
                addLinkAtStart(data);

            }
            else {
                for (int i = 1; i < pos - 1; i++) {
                    node = node.getNext();
                }
                Node node1 = new Node(data, node.getNext());
                node.setNext(node1);
            }
        }

    }
    public void deleteLinkAtStart(){
        if(ifEmpty()){
            System.out.println("List is already empty");
        }
        else{
            Node temp=start;
            start=start.getNext();
            temp.setNext(null);
        }

    }
    public void deleteLinkAtEnd(){
        if(ifEmpty()){
            System.out.println("List is empty");
        }
        else {
            Node node = start;
            if (node.getNext() == null) {
                start=null;

            } else {
                while (node.getNext().getNext() != null)
                    node = node.getNext();
                node.setNext(null);
            }
        }

    }
    public void deleteLinkAtPosition(int pos){
        if(ifEmpty()){
            System.out.println("List Is Empty");
        }
        else{
            int n=sizeOfLinkedList();

            if(pos>n){
                System.out.println("Size of list is :  "+n);
            }
            else{

                if(pos==1 || pos==0)
                    deleteLinkAtStart();
                else{
                        if (pos==n) {
                            deleteLinkAtEnd();

                        } else {
                            Node node=start;
                            for (int i = 1; i < pos - 1; i++) {
                                node = node.getNext();
                            }

                            Node temp=node.getNext();
                            node.setNext(temp.getNext());
                            temp.setNext(null);

                        }
                    }
                }
            }
    }


    public void nodeFromBehind(int pos){
        Node node=start;
        Node position=start;
        for(int i=1;i<pos;i++)
            node=node.getNext();
        while(node.getNext()!=null){
            node=node.getNext();
            position=position.getNext();
        }
        System.out.println("Number at "+pos+" position from behind is : "+position.getData());
    }

    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Enter your Option Below: ");
            System.out.println("1. Add Node at Start: ");
            System.out.println("2. Add Node at End: ");
            System.out.println("3. Delete Node at End: ");
            System.out.println("4. Delete Node at Start: ");
            System.out.println("5. Enter position where Node to be added: ");
            System.out.println("6. Enter position where Node to be removed: ");
            System.out.println("7. Traverse the list: ");
            System.out.println("8. Get Size of List: ");
            System.out.println("9. Check if List is Empty: ");
            System.out.println("10. Find position to get Node from behind: ");
            System.out.println("11. exit: ");

            int ch = sc.nextInt();
            switch (ch) {

                case 1: System.out.println("Enter number to be added to node: ");
                        int number = sc.nextInt();
                        ll.addLinkAtStart(number);
                        break;

                case 2: System.out.println("Enter number to be added to node: ");
                        int number1 = sc.nextInt();
                        ll.addLinkAtEnd(number1);
                        break;

                case 3: ll.deleteLinkAtEnd();
                         break;

                case 4: ll.deleteLinkAtStart();
                        break;

                case 5: System.out.println("Enter number to be added to node: ");
                        int number2=sc.nextInt();
                        System.out.println("Enter position of node: ");
                        int node1=sc.nextInt();
                        ll.addLinkAtPosition(number2,node1);
                        break;

                case 6: System.out.println("Enter position of node to be deleted: ");
                        int node2=sc.nextInt();
                        ll.deleteLinkAtPosition(node2);
                        break;

                case 7: ll.traverse();
                        break;

                case 8: System.out.println(ll.sizeOfLinkedList());
                        break;

                case 9: System.out.println(ll.ifEmpty());
                        break;

                case 10: System.out.println("Enter mth position from behind: ");
                        int node3=sc.nextInt();
                        ll.nodeFromBehind(node3);
                         break;

                case 11: System.out.println("Good Bye");
                         System.exit(0);

                default: System.out.println("Please enter correct Input: ");
                        break;
            }


        }


    }

}
