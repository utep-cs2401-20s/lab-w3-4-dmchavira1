public class GameOfLife {
    int[][] Board;
    int Size;
    int[][] previous;

    //first constructor
    public GameOfLife() {

    }

    //second constructor
    public GameOfLife( int Size) {
        this.Size = Size;
        previous= new int [Size][Size];
        Board = new int [Size][Size];
        }

    //Third constructor
    public GameOfLife(int [][] x) {
        Size = x.length;
        Board = x;
        previous = new int[Size][Size];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                previous[i][j] = x[i][j];
            }
        }
    }
    public int[][] getBoard(){
          return Board;
        }




    public void oneStep() {
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                if (previous[i][j] == 1) {
                    if (neighbors(i, j) < 2) {
                        Board[i][j] = 0;
                    }
                    if (neighbors(i, j) == 2 || neighbors(i, j) == 3) {
                        Board[i][j] = 1;
                    }
                    if (neighbors(i, j) > 3) {
                        Board[i][j] = 0;
                    }
                }
                if (previous[i][j] == 0) {
                    if (neighbors(i, j) == 3) {
                        Board[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                previous[i][j] = Board[i][j];
            }
        }

    }

    public int neighbors(int r, int c) {
        int count = 0;
        //top
        if(((c)>=0) && (c < Size)&&((r-1) >= 0 && (r-1) < Size && previous[r-1][c]==1)){

            count++;
        }
        //top left
        if(((c - 1) >=0) && ((c - 1) < Size)&&((r-1) >= 0 && (r-1) < Size && previous[r-1][c-1]==1)){
            count++;
        }
        //top Right
        if(((c+1)>=0) && ((c+1) < Size)&&((r-1) >= 0 && (r-1) < Size && previous[r-1][c+1]==1)){
            count++;
        }
        // Right
        if(((c+1)>=0) && ((c+1) < Size)&&((r) >= 0 && (r) < Size && previous[r][c+1]==1)){
            count++;
        }
        //Left
        if(((c-1)>=0) && ((c-1 )< Size)&&((r) >= 0 && (r) < Size && previous[r][c-1]==1)){
            count++;
        }
        // bottom Left
        if(((c+1)>=0) && ((c+1 )< Size)&&((r+1) >= 0 && (r+1) < Size && previous[r+1][c+1]==1)){
            count++;
        }
        //bottom Right
        if(((c+1)>=0) && ((c+1 )< Size)&&((r+1) >= 0 && (r+1)< Size && previous[r+1][c+1]==1)){
            count++;
        }
        //bottom
        if(((c)>=0) && ((c)< Size)&&((r+1) >= 0 && (r+1)< Size && previous[r+1][c]==1)){
            count++;
        }
        return count;
    }

    void evolution(int n) {
        while(n > 0){
            oneStep();
            n--;
        }

    }
    public void printBoard(){
        for(int i = 0;i < Board.length;i++){
            for(int j = 0;j<Board[i].length;j++){
                System.out.println(Board[i][j]);
            }
        }

    }




}







