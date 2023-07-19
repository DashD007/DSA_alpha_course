public class lecture_119 {
    public static boolean Search(int matrix[][], int key){
        int row =matrix.length-1;
        int col =0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println("The key found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found!!");
        return false;
    }
    public static void main(String[] args) {
        //in this we will learn about the best optimized method to find the element in sorted matrix;
        int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Search(matrix,15);
    }
}
