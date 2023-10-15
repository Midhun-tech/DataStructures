package LinkedLIst;
// Linked List in GeeksforGeeks
// https://www.geeksforgeeks.org/linked-list-in-java/?ref=lbp
// https://www.youtube.com/watch?v=58YbpRDc4yw&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=44

public class SingleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList() {
        this.size = 0;
    }

    public class Node{

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    // adding values to linked list

    public void add(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if (tail== null){
           add(val);
           return;
        }
        Node n = new Node(val);
        tail.next= n;
        tail = n;
        size++;
    }

    public void insertAtIndex(int val , int index){
        if(index == 0){
            add(val);
            size++;
            return;
        }
        if(index == size){
            insertLast(val);
            size++;
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node n = new Node(val);
        n.next = temp.next;
        temp.next=n;
        size++;
    }


    public void deleteFirst(){
           head = head.next;
    }

    public void deleteLast(){
        Node temp = head;
        for (int i = 1; i < size -1; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    public void deleteAtIndex(int index){
        Node previous = get(index-1);
        previous.next = previous.next.next;
    }


    public Node get(int index){
        if(index == 0){
            return head;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display(){

        Node temp = head;
        while(temp != null){

            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }


}

