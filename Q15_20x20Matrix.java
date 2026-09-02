public class Q15_20x20Matrix {
    public static void main(String[] args) {

        int[][] matrix = new int[20][20];

        // Assign values and print the 20 x 20 matrix
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = i + j;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
