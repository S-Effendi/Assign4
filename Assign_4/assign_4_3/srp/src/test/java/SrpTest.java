import comply.BookComply;
import comply.DetailComply;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import violate.BookViolate;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class SrpTest {

    @Before
    public void setUp() throws Exception{

    }

    @Test
    public void bookViolateTest() throws Exception {
        BookViolate book = new BookViolate("Charlie and the chocolate factory", "Roald Dahl", 1956);
        Assert.assertNotNull(book.getYearPublished());
        System.out.println(book.toString());
    }

    @Test
    public void bookComplyTest() throws Exception {
        BookComply book = new BookComply("Charlie and the chocolate factory", "Roald Dahl", 1956);
        Assert.assertNotNull(book.getYearPublished());
        DetailComply dbook = new DetailComply(book);
        dbook.print();
    }
}
