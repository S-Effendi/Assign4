package violate;

/**
 * Created by S.Effendi on 2017/03/30.
 */
public class CustViolate extends ShopHolderAccViolate{
        public double getUserBalance (String accNum)
        {
            return getBalance(accNum);
        }

    public boolean exists(String accountHolderName) {
        return true;
    }
}
