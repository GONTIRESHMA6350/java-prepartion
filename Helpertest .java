class Helpertest {

    int mindigit(int n) {
        int ans = 10;

        while (n > 0) {
            int last = n % 10;

            if (ans > last) {
                ans = last;
            }

            n = n / 10;
        }

        return ans;
    }

    int maxdigit(int n) {
        int ans = 0;

        while (n > 0) {
            int last = n % 10;

            if (ans < last) {
                ans = last;
            }

            n = n / 10;
        }

        return ans;
    }

    int minmaxpro(int n) {
        int m1 = mindigit(n);
        int m2 = maxdigit(n);

        return m1 * m2;
    }
}
