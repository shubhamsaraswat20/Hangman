import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int size = 10;
        int[] marks = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 elements for array :");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }
        System.out.println("Enter value to search for :");
        int value = scanner.nextInt();
        int pos = linearSearch(marks, value);

        if (pos == -1){
            System.out.println(value + "not found in the array");
        }
        else {
            System.out.println(value + "found at index" + pos);
        }

    }

    public static int linearSearch(int[] marks, int value) {
        int pos = -1;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] == value){
                pos = i;
                break;
            }
        }
        return pos;
    }
}
