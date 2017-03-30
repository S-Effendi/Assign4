package AdpTest;

import comply.CustComply;
import comply.ShopHolderAccComply;
import comply.ShopOperationsComply;
import org.junit.Before;
import org.junit.Test;
import violate.CustViolate;

/**
 * Created by S.Effendi on 2017/03/30.
 */
public class AdpTest {

    @Before
    public void setUp() throws Exception{

    }

    @Test
    public void testViolateADP() throws Exception {
        System.out.println("Adp Violation");
        CustViolate cust = new CustViolate();
        cust.payAcc("Wendy", 750);
        cust.getBalance("211039853");
    }

        @Test
        public void AdpComplyTest() throws Exception {
            System.out.println();
            ShopHolderAccComply accHolder = new ShopHolderAccComply();
            accHolder.payAcc(new CustComply(),"Wendy",2750);
            ShopOperationsComply shopOperationsComply = new ShopOperationsComply(new CustComply());
            shopOperationsComply.AccActions();
    }
}
