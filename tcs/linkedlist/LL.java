package tcs.linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next =head;
        head = node;

        if(tail == null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail=node;
       
        size+=1;
    }
    public void insertAtPosition(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
        
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node temp = head;

        while(temp.next != tail){
            temp=temp.next;
        }
        temp.next = null;
        tail=temp;
        size--;
        return temp.value;
    
    }
    public boolean searchElement(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value) return true;
            temp = temp.next;
        }
        return false;
    }
   public int middleElement(){
    if(head == null){
        System.out.println("List is empty");
    }
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next!=null){
        slow= slow.next;
        fast=fast.next.next;
    }
    return slow.value;
   }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
