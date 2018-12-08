/**
 *
 * @author Prateek Agrawal
 */

class Solution {
    public int solution(int[] A) {
        int start, i = -1, n = -1, tempn, alen = A.length;
        boolean v[] = new boolean[1000000];

        while (++i < alen) {
            if (!v[i]) {
                start = i;
                tempn = 0;
                while (true) {
                    if (!v[i]) {
                        v[i] = true;
                        if (i == A[i]) {
                            start = i;
                            break;
                        }
                        i = A[i];
                        tempn++;
                    } else break;
                }
                if (tempn > n)
                    n = tempn;
            } else continue;
            i = start;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(new Solution1().solution(new int[]{5, 4, 0, 3, 1, 6, 2}));
    }
}
