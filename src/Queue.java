public class Queue {

    public int[] q;
    public int size;
    public int total;
    public int front;
    public int rear;

    public Queue() {

        size = 10;
        total = 0;
        front = 0;
        rear = 0;
        q = new int[size];

    }

}
