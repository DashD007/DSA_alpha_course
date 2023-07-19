public class practice_question_matrix {
    //question_1
    public static int count_7(int matrix[][]){
        int count =0;
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }

    //question 2
    public static int Sum_Second_row(int matrix[][]){
        int sum=0;
        for(int j=0;j<matrix[0].length;j++){
            sum+= matrix[1][j];
        }
        return sum;
    }

    //question 3
    public static void Transpose(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},{8,8,7}};
        System.out.println(count_7(matrix));
        int arr[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(Sum_Second_row(arr));
        int matrix_1[][] = {{1,1,1},{2,2,2}};
        Transpose(matrix_1);
    }
}
