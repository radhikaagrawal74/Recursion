import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:" + " ");
        int n = sc.nextInt();
        int temp = n, sum = 0;
        int rep = String.valueOf(temp).length();
        while (n != 0) {
            int p = n % 10;
            sum += Math.pow(p, rep);
            n /= 10;
        }
        if (temp == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
