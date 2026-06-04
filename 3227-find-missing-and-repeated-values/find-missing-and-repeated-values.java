class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        long expectedSum = (long) N * (N + 1) / 2;
        long actualSum = 0;
        int xor = 0;

        // Step 1: Compute actualSum and XOR of all numbers
        int[] freq = new int[N + 1]; // To track frequency of numbers
        int duplicate = -1, missing = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                actualSum += num;
                xor ^= num;
                freq[num]++;
                
                if (freq[num] > 1) {
                    duplicate = num;
                }
            }
        }

        // Step 2: Find XOR of all numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            xor ^= i;
            if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}
