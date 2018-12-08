/**
 *
 * @author Prateek Agrawal
 */

class Solution1 {
    public int solution(int[] A) {
        int[] a = A;
        int q, p, hv = 0, n = a.length;
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            if (a[0] == a[1])
                return 1;
            else return 2;
        if (a[0] == a[1]) {
            p = 0;
            q = 1;
        } else {
            hv++;
            p = 1;
            q = 1;
        }

        for (int i = 2; i < n; i++) {
            if (i == n - 1) {
                if (a[i] == a[i - 1]) {
                    hv++;
                } else {
                    if ((a[p - 1] < a[p] && a[q + 1] < a[q]) || (a[p - 1] > a[p] && a[q + 1] > a[q])) hv++;
                    hv++;
                }
                break;
            }

            if (a[i] == a[i - 1])
                q = i;
            else {
                if (p == 0) {
                    hv++;
                } else if ((a[p - 1] < a[p] && a[q + 1] < a[q]) || (a[p - 1] > a[p] && a[q + 1] > a[q])) hv++;
                p = i;
                q = i;
            }
        }

        return hv;
    }


    public static void main(String[] args) {
        System.out.println(new Solution1().solution(new int[]{2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5}));
    }
}
