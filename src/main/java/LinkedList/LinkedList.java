package LinkedList;

public class LinkedList {
    private Node head, tail;
    private int length;

    // Inner Node class
    class Node {
        int value;
        String name;
        Node next;
        Node(int value, String name) {
            this.value = value;
            this.name = name;
        }
        @Override
        public String toString() {
            return "Value: " + value + ", Name: " + name;
        }
    }
    // Constructor
    public LinkedList(int value, String name) {
        head = tail = new Node(value, name);
        length = 1;
    }
    // Remove first node
    public void removeFirst() {
        if (head == null) return;
        head = (head == tail) ? null : head.next;
        if (--length == 0) tail = null;
    }
    //Remove first
    public Node removeLast()
    {
        if(length==0)
        {
            return null;
        }

        Node temp=head;
        Node prev=head;
        if (length == 1) { // If only one node exists
            head = null;
            length--;
            return temp;
        }
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        length--;
        return temp;
    }
    //Remove at index
    public boolean remove(int index)
    {
        Node temp= get(index-1);
        temp.next=temp.next.next;
        temp.next.next=null;
        return true;
    }

    // Insert at beginning
    public void prepend(int value, String name) {
        Node newNode = new Node(value, name);
        newNode.next = head;
        head = newNode;
        if (length++ == 0) tail = head;
    }
    // Insert at end
    public void append(int value, String name) {
        Node newNode = new Node(value, name);
        if (tail != null) tail.next = newNode;
        tail = newNode;
        if (length++ == 0) head = tail;
    }
    // Print Linked List
    public void printList() {
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.println(temp);
    }
    // Delete last node
    public void delete() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) temp = temp.next;
            temp.next = null;
            tail = temp;
        }
        length--;
    }
    // Get node at index
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) temp = temp.next;
        return temp;
    }
    // Print specific node
    public void printNode(int index) {
        Node node = get(index);
        System.out.println(node != null ? node : "Node not found.");
    }
    public boolean set(int index,int data)
    {
        Node temp=get(index);
        if(temp!=null)
        {
            temp.value= data;
            return true;
        }
        return false;
    }
    public boolean insert(int index, int value, String name)
    {
        Node temp = get(index-1);
        if(index==0)
        {
            prepend(value,name);
            return true;
        }
        else if(index==length)
        {
            append(value,name);
            return true;
        }
        Node newNode = new Node(value,name);

            Node prev=temp;
            newNode.next=prev.next;
            prev.next=newNode;
            length++;
            return true;
        }


    // Getters
    public int getHead() { return (head != null) ? head.value : -1; }
    public int getTail() { return (tail != null) ? tail.value : -1; }
    public int getLength() { return length; }

}
