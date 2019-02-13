import java.util.Date;

public class Array {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*i;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int arr1:
             arr) {
            System.out.println(arr1);
        }

        Date[] arr2 = new Date[10];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new Date(2005-1900, 11, i+1);
        }

        for (Date date : arr2) {
            System.out.println(date);
        }

        int[][] arr3 = new int[20][20];

        for (int i = 0; i < 20; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                arr3[i][i1] = (int)(Math.random() * 100);
            }
        }

        for (int[] ints : arr3) {
            for (int ints1 : ints) {
                System.out.println(ints1);
            }
        }

    }

}
