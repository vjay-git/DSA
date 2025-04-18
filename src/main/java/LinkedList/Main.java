package LinkedList;

public class Main {
    public static void main(String[] args) {
        // Initialize LinkedList with first node
        LinkedList myList = new LinkedList(5, "Kumar");
        // Append nodes at the end
        myList.append(5, "Raju");
        myList.append(6, "Ajay");

        // Prepend a node at the beginning
        myList.prepend(1000, "Vijay");

        // Remove the first node
        myList.removeFirst();

        // Print entire list
        System.out.println("Linked List:");
        myList.set(1,0);
        myList.insert(2,2,"nm");
        myList.printList();

        // Print specific node
        System.out.print("\nNode at index 2: ");
        myList.printNode(2);

        // Print Head, Tail, and Length
        System.out.println("\nHead: " + myList.getHead());
        System.out.println("Tail: " + myList.getTail());
        System.out.println("Length: " + myList.getLength());
        myList.printList();
        System.out.println("After deleting the index," +myList.remove(2));
        myList.printList();

    }
}
