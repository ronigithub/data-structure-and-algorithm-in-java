package linkedlist;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(18);
        list.insert(45);
        list.insert(12);

        // insert at start
        list.insertAtStart(25);

        // insert at any location
        list.insertAt(0, 55);

        list.show();
    }
}
