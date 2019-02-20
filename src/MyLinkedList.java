public class MyLinkedList {

    private LinkedList head;
    private LinkedList tail;
    private int currentSize;

    public LinkedList getHead() {
        return head;
    }

    public void setHead(LinkedList head) {
        this.head = head;
    }

    public LinkedList getTail() {
        return tail;
    }

    public void setTail(LinkedList tail) {
        this.tail = tail;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public MyLinkedList() {
        this.currentSize = 0;
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

        LinkedList linkedList1 = new LinkedList(10 , null);

    }

    public void display(LinkedList )

}
