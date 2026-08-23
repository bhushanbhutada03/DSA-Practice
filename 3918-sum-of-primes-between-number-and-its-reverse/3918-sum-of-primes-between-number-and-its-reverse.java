class Solution {
    public int sumOfPrimesInRange(int n) {
        int r = 0, t = n, ans = 0;

        while (t > 0) {
            r = r * 10 + t % 10;
            t /= 10;
        }

        for (int i = Math.min(n, r); i <= Math.max(n, r); i++) {
            if (isPrime(i)) ans += i;
        }

        return ans;
    }

    boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;

        return true;
    }
}