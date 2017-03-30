package OcpTest;

import comply.PerimeterCalcComply;
import comply.RectangleComply;
import comply.TriangleComply;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class OcpTest {

    @Before
    public void setUp() throws Exception{

    }

    @Test
    public void buildingViolateTest() {
        RectangleComply rectBuild = new RectangleComply(5, 4);
        TriangleComply triBuild = new TriangleComply(8,5,12);
        PerimeterCalcComply perCalc = new PerimeterCalcComply();

        System.out.println(perCalc.perimeter(rectBuild));
        System.out.println(perCalc.perimeter(triBuild));

        Assert.assertEquals(perCalc.perimeter(rectBuild), 18);
    }
}
