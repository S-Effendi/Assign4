package LspTest;

import comply.ImageComply;
import comply.TextComply;
import org.junit.Before;
import org.junit.Test;
import violate.CellViolate;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class LspTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void LSPViolateTest() throws Exception {
        CellViolate cv = new CellViolate();
        cv.sendIt(2);
        try {
            cv.sendIt(1, 2, 3);
        } catch (Exception e) {
            System.out.println("This cell cannot send images");
        }
    }

    @Test
    public void LSPComplyTest() throws Exception {
        ImageComply ic = new ImageComply();
        TextComply tc = new TextComply();
        tc = ic;
        ic.sendIt(1,2,3);
    }
}
