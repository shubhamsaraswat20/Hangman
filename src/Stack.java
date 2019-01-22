public class Stack {

    int size;
    int topOfStack = -1;
    int[] stackArray;

    public Stack(int size){

        this.size = size;
        stackArray = new int[size];

    }

    public void push(int value){

     // Todo check if the array is already full

        if (!isFull()){
            topOfStack++;
            stackArray[topOfStack] = value;
        }

    }

    boolean isFull(){

        boolean response = false;

        if ((stackArray[stackArray.length-1] != 0) && (topOfStack == (stackArray.length-1))) {
            response = true;
        }
            return response;

    }

    int pop(){

        int response = 0;

        // Todo check if the array is already empty

        if (!isEmpty()){
            stackArray[topOfStack] = 0;
            topOfStack--;
        }
        return response;

    }

    boolean isEmpty(){

        boolean response = false;

        if (topOfStack == -1){
            response = true;
        }
        return response;

    }

    public static void main(String[] args) {

        Stack stack1 = new Stack(10);

        for (int length = stack1.stackArray.length - 1; length >= 0; length--) {
            System.out.println(stack1.stackArray[length]);
        }

        for (int i = 0; i < 10; i++) {

            stack1.push(40+i);

        }

        System.out.println("-----------");

        for (int length = stack1.stackArray.length - 1; length >= 0; length--) {
            System.out.println(stack1.stackArray[length]);
        }

        System.out.println("-----------");

        stack1.pop();
        stack1.pop();

        for (int length = stack1.stackArray.length - 1; length >= 0; length--) {
            System.out.println(stack1.stackArray[length]);
        }

    }

}
