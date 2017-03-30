package Isptest;

import comply.LGComply;
import comply.SonyComply;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import violate.LGViolate;
import violate.SonyViolate;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class IspTest{
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void ISPViolateTest() throws Exception {
        System.out.println("Cluttered Interface");
        SonyViolate personalCell = new SonyViolate();
        personalCell.sendIt();
        personalCell.receiveIt();
        personalCell.connectIt();
        personalCell.uploadIt();

        LGViolate workCell = new LGViolate();
        workCell.sendIt();
        workCell.receiveIt();
        workCell.connectIt();
        workCell.uploadIt();
    }
    @Test
    public void ISPComplyTest() throws Exception {
        System.out.println("Multiple Interfaces");
        SonyComply pcell = new SonyComply();
        pcell.sendIt();
        pcell.receiveIt();
        pcell.connectIt();
        pcell.uploadIt();

        LGComply wcell = new LGComply();
        wcell.sendIt();
        wcell.receiveIt();
    }
}
