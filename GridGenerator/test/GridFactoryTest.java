import junit.framework.*;

public class GridFactoryTest extends TestCase {
    protected void setUp()
    {
        grid = cut.getGrid();
    }

    public void testRowSize()
    {

    }
    private final GridFactory cut = new GridFactory();
    private final Grid grid;
}