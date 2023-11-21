import java.util.Scanner;

public class altsum {
    public static int AltSum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return AltSum(n - 1) - n;
        } else {
            return AltSum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int res = AltSum(n);
        System.out.println("alternate sum is:" + res);
    }
}
