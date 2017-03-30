package dipTest;

import comply.GeneralBeeComply;
import comply.SergentBeeComply;
import comply.WorkerBeeComply;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import violate.GeneralBeeViolate;
import violate.WorkerBeeViolate;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class DipTest{


    @Test
    public void dipViolateTest() throws Exception {
        WorkerBeeViolate wbee = new WorkerBeeViolate();
        GeneralBeeViolate gbee = new GeneralBeeViolate();
        gbee.setWorkerBee(wbee);
        gbee.manage();
    }

    @Test
    public void dipComplyTest() throws Exception {
        WorkerBeeComply wbee = new WorkerBeeComply();
        SergentBeeComply swbee = new SergentBeeComply();
        GeneralBeeComply gbee = new GeneralBeeComply();
        gbee.setWorkerBee(wbee);
        gbee.manage();
        gbee.setWorkerBee(swbee);
        gbee.manage();
    }

}
