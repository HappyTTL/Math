/**
 * Created by Tingting on 10/7/16.
 */
public class Math {
    /**
     * Count Numbers with Unique Digits: Given a non-negative integer n, count all numbers with unique digits, x,
     * where 0 ≤ x < 10n.

     Example:

     Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100, excluding [11,22,33,44,55,66,77,88,99])
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 10;
        }
        int prev = 9, count = 10;
        for (int i = 2; i <= n; i++) {
            prev = prev * (11 - i);
            count += prev;
        }
        return count;
    }
}
