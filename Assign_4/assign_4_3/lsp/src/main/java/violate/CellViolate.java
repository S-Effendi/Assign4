package violate;

import java.rmi.UnexpectedException;
/**
 * Created by S.Effendi on 2017/03/29.
 */
public class CellViolate {
    public void sendIt(int name1)
    {
        System.out.println("sending text...");
    }
    public void sendIt(int name1, int name2, int name3)
    {
        throw new UnsupportedOperationException();
    }
}
