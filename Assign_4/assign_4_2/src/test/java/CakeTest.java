import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by S.Effendi on 2017/03/30.
 */
public class CakeTest {

    private Cake cake = new Cake("Marvellous Chocolateir", "Chocolate Sponge", "Chocolate Mouse", "Chocolate fondent", true);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testCake() throws Exception {
        System.out.println(cake.toString());
        Assert.assertEquals(true, cake.getTopping().isIcing());
    }

    @Test
    public void testCake2() throws Exception {
        cake.getBase().setFlavour("Strawberry");
        System.out.println(cake.toString());
        Assert.assertSame(cake.getBase().getFlavour(),"Strawberry");
    }

}
