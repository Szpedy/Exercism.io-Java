import java.util.List;

class Matrix {
    int[][] matrix;
    int numberOfCols;
    int numberOfRows;

    Matrix(String matrixAsString) {
        numberOfRows = (int) matrixAsString.chars().filter(ch -> ch == '\n').count() + 1;
        numberOfCols = (int) matrixAsString.split("\n")[0].chars().filter(ch -> ch == ' ').count() + 1;
        matrix = new int[numberOfRows][numberOfCols];
        int i = 0;
        int j = 0;
        for (String row : matrixAsString.split("\n")) {
            for (String cell : row.split(" ")) {
                matrix[i][j] = Integer.parseInt(cell);
                j++;
            }
            i++;
            j = 0;
        }
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        int[] column = new int[numberOfRows];
        for (int i = 0; i < numberOfRows; i++) {
            column[i] = matrix[i][columnNumber - 1];
        }
        return column;
    }
}
