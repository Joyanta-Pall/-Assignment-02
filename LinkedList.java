class LinkedList {
   Node head;
   Node tail;
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addLast(int item){
        Node newNode = new Node(item);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void removeLast(){
        if (head.next == null){
            head = null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }
    public void reverse() {
        Node prev = null;
        Node temp = head;
        Node next;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }
}
