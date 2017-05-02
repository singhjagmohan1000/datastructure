package com.ds.linkedlist;

/**
 * Created by gaggi on 4/15/17.
 */
public class PartitionFiftyNine {

    public Node partition(Node head,int k){
        Node temp1=null,temp2=null,temp=null,tempStart=null;
        while(head!=null){
            Node node=new Node(head.getData(),null);

            if(head.getData()<k) {

                if (temp1 == null)
                { temp1 = node;
                        tempStart=temp1;}
                else {
                    temp1.setNext(node);
                    temp1=temp1.getNext();
                }
            }
            else{
                if (temp2 == null)
                {
                    temp2 = node;
                    temp=temp2;}
                else
                { temp2.setNext(node);
                        temp2=temp2.getNext();}
            }

            head=head.getNext();
        }
        System.out.println(temp1.getData());
        temp1.setNext(temp);
        return tempStart;
    }

    public static void main(String[] args) {
        PartitionFiftyNine partitionFiftyNine= new PartitionFiftyNine();
        LinkedList linkedList = new LinkedList();
        linkedList.addLinkAtStart(12);
        linkedList.addLinkAtStart(11);
        linkedList.addLinkAtStart(5);
        linkedList.addLinkAtStart(7);
        linkedList.addLinkAtStart(9);
        linkedList.addLinkAtStart(4);
        linkedList.addLinkAtStart(2);
        linkedList.addLinkAtStart(1);
        Node head = linkedList.getHead();

        linkedList.traverseRecursive(head);
        head=partitionFiftyNine.partition(head,7);
        linkedList.traverseRecursive(head);

    }
}
