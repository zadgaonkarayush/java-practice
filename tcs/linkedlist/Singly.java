package tcs.linkedlist;

public class Singly {
    public static void main(String[] args){
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);    
        list.insertFirst(1);
        list.insertFirst(4);
        list.insertLast(10);
        list.insertAtPosition(5, 3);
        list.searchElement(4);
        list.display();
       System.out.println( list.middleElement());
    }
}
