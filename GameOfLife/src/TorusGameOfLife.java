public class TorusGameOfLife extends GameOfLife {

    public TorusGameOfLife() {


    }

    public TorusGameOfLife(int Size) {
        super(Size);


    }

    public TorusGameOfLife(int[][] x) {
        super(x);

    }

    public int[][] getBoard() {
        return Board;
    }

    public void oneStep() {

    }

    @Override
    public int neighbors(int r, int c) {
        int count = 0;
        //torus top
        if (Board[(r - 1) % Size][(c) % Size] == 1) {
            count++;
        }
        //torus bottom
        if (Board[(r + 1) % Size][(c) % Size] == 1) {
            count++;
        }
        //torus left
        if(Board[(r) % Size][(c - 1) % Size]==1){
            count++;
        }
        //torus Right
        if(Board[(r)% Size][(c - 1) % Size]==1){
            count++;
        }
        // torus top left
        if(Board[(r - 1) % Size][(c - 1) % Size]==1){
            count++;
        }
        // torus top right
        if(Board[(r - 1) % Size][(c + 1) % Size]==1){
            count++;
        }
        //torus bottom left
        if(Board[(r - 1)% Size][(c + 1) % Size]==1){
            count++;
        }
        // torus bottom right
        if(Board[(r + 1) % Size][(c - 1) % Size]==1){
            count++;
        }

        return count;
    }
    void evolution(int n){

    }

    public void printBoard() {
        super.printBoard();
    }
}
