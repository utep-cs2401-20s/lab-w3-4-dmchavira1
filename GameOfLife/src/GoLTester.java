import org.junit.Test;
import static org.junit.Assert.*;
public class GoLTester {
    @Test
    public void neighbors() {
        int[][] A = {
                {0, 0, 0},
                {1, 1, 1},
                {0, 0, 0}};
        int B = 3;

        GameOfLife x = new GameOfLife(A);
        assertEquals(B, x.neighbors(0, 0));
    }
    @Test
    public void neighbors2() {
        int[][] A = {
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 1, 1, 1, 0,},
                {0, 1, 1, 1, 0, 0,},
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,}};
        int B = 4;

        GameOfLife x = new GameOfLife(A);
        assertEquals(B, x.neighbors(3, 3));
    }
    @Test
    public void neighbors3() {
        int[][] A = {
                {0, 0, 0},
                {0, 1, 1},
                {0, 1, 1}};
        int B = 1;

        GameOfLife x = new GameOfLife(A);
        assertEquals(B, x.neighbors(0, 1));
    }
    @Test
    public void neighbors4() {
        int[][] A = {
                {0, 0, 0},
                {0, 1, 1},
                {0, 1, 1}};
        int B = 1;

        GameOfLife x = new GameOfLife(A);
        assertEquals(B, x.neighbors(0, 1));
    }
    @Test
    public void neighbors5() {
        int[][] A = {
                {0, 0, 0},
                {0, 1, 1},
                {0, 1, 1}};
        int B = 3;

        GameOfLife x = new GameOfLife(A);
        assertEquals(B, x.neighbors(1, 1));
    }

    // oneStep Tests
    //#1
    @Test
    public void oneStep() {
        int[][] A = {
                {0, 0, 0,},
                {0, 1, 0,},
                {0, 1, 1,},
        };
        int[][] B = {
                {0, 0, 0,},
                {0, 0, 0,},
                {0, 0, 0,},
        };
        GameOfLife x= new GameOfLife(A);
        x.oneStep();
        assertArrayEquals(B, x.getBoard());
    }
    @Test
    public void oneStep2() {
        int[][] A = {
                {0, 1, 0,},
                {0, 1, 0,},
                {0, 1, 0,},
        };
        int[][] B = {
                {0, 0, 0,},
                {1, 1, 1,},
                {0, 0, 0,},
        };
        GameOfLife x= new GameOfLife(A);
        x.oneStep();
        assertArrayEquals(B, x.getBoard());
    }
}


