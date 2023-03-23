public class MatrisinTranspozu {

    static void arr(int[][] arr1, int m, int n) {
        int[][] transpozu = new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                transpozu[i][j] = arr1[j][i];
                System.out.print(transpozu[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matris = {{1, 5, 6},{2, 9, 3},{3, 7, 8},{4, 1, 5}};
        int m = matris.length;
        int n = matris[0].length;

        arr(matris, m, n);
    }
}
