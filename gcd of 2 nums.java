import java.util.Scanner;

class GCD {

    int gcd(int a, int b) {

        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }

        int s = Math.min(a, b);

        for (int i = s; i >= 1; i--) {

            if ((a % i == 0) && (b % i == 0)) {
                return i;
            }
        }

        return 1;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        GCD obj = new GCD();

        int ans = obj.gcd(a, b);

        System.out.println(ans);
    }
}