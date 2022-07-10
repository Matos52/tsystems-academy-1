package Arrays;

public class Skuska {

    public static void main(String[] args) {

        // [row - riadok] [column - stlpec]
        int[][] aMatrix ={{1, 2, 3} , {4, 5, 2,} , {7, 1, 8,}}; //[3][3]
        int[][] bMatrix ={{7, 5, 6} , {4, 2, 1,} , {5, 9, 8,}}; //[3][3]

        //printMatrix(aMatrix);
        //printMatrix(bMatrix);

        int[][] addition = addMatrices(aMatrix, bMatrix);
        int[][] multiply = multiplyMatrices(aMatrix, bMatrix);
        int[][] transpose = transposeMatrices(aMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        if(matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Nieje mozne vykonat operaciu. Matice musia mat rovnaky pocet stlpcov a riadkov.");
            return null;
        } else {
            int[][] matrixC = new int[matrixA.length][matrixB.length];
            System.out.println("Vysledok scitania matic je: ");

            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[0].length; j++) {
                    matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                    System.out.print(matrixC[i][j] + " ");
                }
                System.out.println();
            }
            return matrixC;
        }
   }

    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        if(matrixA[0].length != matrixB.length) {
            System.out.println("Nieje mozne vykonat operaciu. Matice A musi mat rovnaky pocet riadkov ako Matica B stlpov.");
            return null;
        } else {
            int[][] matrixC = new int[matrixA.length][matrixB[0].length];
            System.out.println("Vysledok nasobenia matic je: ");

            for (int row = 0; row < matrixA.length; row++) {
                for (int column = 0; column < matrixB[0].length; column++) {
                    for (int i = 0; i < matrixA[0].length; i++) {
                        matrixC[row][column] += matrixA[row][i] * matrixB[i][column];
                    }
                    System.out.print(matrixC[row][column] + " ");
                }
                System.out.println();
            }
            return matrixC;
        }
    }

    private static int[][] transposeMatrices(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];
        System.out.println("Vysledok transpozicie matice: ");

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposed[i][j] = matrix[j][i];
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

        return transposed;
    }
}
