import junit.framework.*;

public class GridFactoryTest extends TestCase {
    @Test
    public void testRowSizeIsNine()
    {
        int size = 9;
        grid = cut.makeGrid(size);
        assert(grid.rowSize() == size);
    }

    @Test
    public void testColSizeIsNine()
    {
        int size = 9;
        grid = cut.makeGrid(size);
        assert(grid.columnSize() == size);
    }

    // cut = class under test
    private final GridFactory cut = new GridFactory();
    private final Grid grid;
}