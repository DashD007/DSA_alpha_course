public class lecture_215 {
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

    public static boolean isSafe(char[][] chess, int row,int col){
        //for vertically left diagonal;
        for(int i=row-1;i>0;i--){
            for(int j =col-1;j>0;j--){
                if(chess[i][j]=='Q'){
                    return false;
                }
            }
        }
        //for vertically straight up
        for(int i=row-1;i>0;i--){
            if(chess[i][col]=='Q'){
                return false;
            }
        }

        //for vertically right diagonal
        for(int i=row-1;i>0;i--){
            for(int j=col+1;j<chess[0].length;j++){
                if(chess[i][j]=='Q'){
                    return false;
                }
            }
        }
        return true;
    }
    public static void nQueens(char[][] chess, int row){
        //base case
        if(row==chess.length){
            PrintChess(chess);
            return;
        }
        //recursion
        for(int j=0;j<chess.length;j++){
            if(isSafe(chess,row,j)){
                chess[row][j] = 'Q';
                nQueens(chess,row+1);
                chess[row][j] = 'X';
            }

        }
    }
    public static void main(String[] args) {
        //here we will discuss about the n Queens problem...
        //n Queens problem means we have to place n queens into the nXn chess board so that no queens can attack each other..
        //step 1 : create a table and put queens into rows..without focusing on attack
        //step 2 : now we will modify our code so that the queens can not attack;

        //create a chess board
        int n = 4;
        char[][] chess = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chess[i][j] = 'X';
            }
        }
        nQueens(chess,0);
    }
}
