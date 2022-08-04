package linkedlist.singly;

public class SinglyLinkList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkList(int nodeValue) {
//        head = new Node();
        Node node = new Node();
        node.next = null;
        node.data = nodeValue;

        head = node;
        tail = node;
        size = 1;
        return head;
    }


}
