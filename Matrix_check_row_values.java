public class Matrix_check_row_values {
    public static void main(String[] args) {
        int R = 3, C = 4;

        int[][] matrix ={{5,6,3,8},{1,2,10,7},{11,9,12,4}};
        boolean row1 = false;
        boolean row2 = false;
        for(int i = 0;i<=R-1;i++){
            for(int j =0;j<=C-1;j++){
                if (i ==1 && matrix[i][j]>1 && matrix[i][j]<C) {
                    row1 = true;
                }
                if (i == 2 && matrix[i][j] > C+1 && matrix[i][j] < 2*C) {
                    row2 = true;
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        if (row1 && row2) {
            System.out.println("Row 1 has values between 1 and 3, and Row 2 has values between 4 and 6.");
        } else {
            System.out.println("Conditions not met for the specified rows.");
            
        }
    }
}
