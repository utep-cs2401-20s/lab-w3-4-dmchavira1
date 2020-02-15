public class TorusGameOfLife extends GameOfLife {

    public TorusGameOfLife() {
        super();

    }

    public TorusGameOfLife(int Size) {
        super(Size);


    }

    public TorusGameOfLife(int[][] Board) {
        super(Board);

    }

    @Override
    public int neighbors(int r, int c) {
        int count = 0;

        //torus top

            if (previous[((r-1)+Size) % Size][((c) + Size)% Size] == 1) {
                count++;
            }
            //torus bottom
            if (previous[((r + Size)+1) % Size][((c)+Size) % Size] == 1) {
                count++;
            }
            //torus left
            if (previous[((r)+Size) % Size][((c - 1)+Size) % Size] == 1) {
                count++;
            }
            //torus Right
            if (previous[((r)+Size) % Size][((c +1)+ Size) % Size] == 1) {
                count++;
            }
            // torus top left
            if (previous[((r-1)+Size) % Size][((c - 1)+Size) % Size] == 1) {
                count++;
            }
            // torus top right
            if (previous[((r-1)+Size) % Size][((c +1)+Size) % Size] == 1) {
                count++;
            }
            //torus bottom left
            if (previous[((r+1)+Size) % Size][((c -1)+Size) % Size] == 1) {
                count++;
            }
            // torus bottom right
            if (previous[((r +1)+Size) % Size][((c+1)+Size) % Size] == 1) {
                count++;

        }
        return count;
    }


     public void printBoard() {
        super.printBoard();
    }
}
