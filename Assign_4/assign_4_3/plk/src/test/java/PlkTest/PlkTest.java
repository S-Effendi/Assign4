package PlkTest;

import comply.custOrderComply;
import org.junit.Before;
import org.junit.Test;
import violate.cupcakeViolate;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class PlkTest {

    @Before
    public void setUp() throws Exception{

    }

    @Test
    public void cupcakeViolateTest() throws Exception {
        cupcakeViolate cc = new cupcakeViolate();
        cc.setStyle("Flake");
        cc.setPrice(21);
        cc.getTopping().setFlavour("Chocolate");
        cc.getTopping().setPrice(7);
        cc.print();
    }

    @Test
    public void cupcakeComplyTest() throws Exception {
        custOrderComply orderCupcake = new custOrderComply();
        orderCupcake.orderCupcake();
        orderCupcake.print();
    }
}
