public class lecture_214 {
    public static void PrintChess(char[][] chess){
        int n = chess.length;
        int m = chess[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(chess[i][j]+"");
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void nQueens(char[][] chess, int row){
        //base case
        if(row==chess.length){
            PrintChess(chess);
            return;
        }
        //recursion
        for(int j=0;j<chess.length;j++){
            chess[row][j] = 'Q';
            nQueens(chess,row+1);
            chess[row][j] = 'X';
        }
    }
    public static void main(String[] args) {
        //here we will discuss about the n Queens problem...
        //n Queens problem means we have to place n queens into the nXn chess board so that no queens can attack each other..
        //step 1 : create a table and put queens into rows..without focusing on attack

        //create a chess board
        int n = 2;
        char[][] chess = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chess[i][j] = 'X';
            }
        }
        nQueens(chess,0);
    }
}
