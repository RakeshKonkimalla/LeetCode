import java.util.stream.*;
class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        return IntStream.range(0, m)
                .mapToObj(i ->
                    IntStream.range(0, n)
                        .map(j ->
                            IntStream.range(
                                Math.max(0, i - k),
                                Math.min(m, i + k + 1)
                            )
                            .map(r ->
                                IntStream.range(
                                    Math.max(0, j - k),
                                    Math.min(n, j + k + 1)
                                )
                                .map(c -> mat[r][c])
                                .sum()
                            )
                            .sum()
                        )
                        .toArray()
                )
                .toArray(int[][]::new);
    }
}