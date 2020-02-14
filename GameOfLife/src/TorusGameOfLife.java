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
        if (Board[(r - 1) % Size][(c - 1) % Size] == 1) {
            count++;
        }
        if (Board[(r - 1) % Size][(c - 1) % Size] == 1) {
            count++;
        }

        return count;
    }

}
