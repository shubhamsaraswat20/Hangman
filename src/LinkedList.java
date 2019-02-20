import javafx.scene.Node;

public class LinkedList {

    private int data;
    private LinkedList next;

    public void setNext(LinkedList next) {
        this.next = next;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public LinkedList(int data, LinkedList next) {
        this.data = data;
        this.next = next;
    }

    public LinkedList() {
        this.data = 0;
        this.next = null;
    }

    public LinkedList(int data) {
        this.data = data;
        this.next = null;
    }


    public static void main(String[] args) {



    }
}
