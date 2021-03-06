package grid;

public class Grid {
    private int gridSize = 3;
    private char[][] grid;
    public static final char DEFAULT_CHAR = ' ';

    public Grid() {
       this(3);
    }

    public Grid(int size) {
        if (size > 3) {
            gridSize = size;
        }
        grid = new char[gridSize][gridSize];
        clearGrid();
    }

    public char[][] getGrid() {
        return grid;
    }

    public void clearGrid() {
        for(int i = 0; i < gridSize; ++i)
            for (int j = 0; j < gridSize; ++j)
                grid[i][j] = DEFAULT_CHAR;
    }

    public boolean setChar(char symbol, int row, int col) throws CellNotFreeException
    {
        boolean isMove = false;
        try {
            if (grid[row][col] != DEFAULT_CHAR)
                throw new CellNotFreeException();

            grid[row][col] = symbol;
            isMove = true;
        }
        catch (IndexOutOfBoundsException e) {
            throw e;
        }
        catch (CellNotFreeException e) {
            throw e;
        }
        return isMove;
    }


}