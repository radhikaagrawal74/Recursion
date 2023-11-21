public class maxval {
    static int[] arr = { 13, 1, -3, 22, 5 };

    public static void main(String[] args) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
