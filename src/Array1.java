public class Array1 {

    public static void main(String[] args) {

        int n = 5;//(int)(Math.random() * 100);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("Array[" +i+ " ] = " + arr[i]);
            arr[i+1]=arr[i];
        }
        arr[0] = 17;
        System.out.println(" Number of elements "+ n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
