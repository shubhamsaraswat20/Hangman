public class Array1 {

    public static void main(String[] args) {

        int n = (int)(Math.random() * 100);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array[" +i+ " ] = " + arr[i]);
        }
        System.out.println(" Number of elements "+ n);
    }

}
