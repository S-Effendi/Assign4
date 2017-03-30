package comply;

/**
 * Created by S.Effendi on 2017/03/30.
 */
public class CustComply extends ShopHolderAccComply implements ShopServiceComply {

    public double getCustBalance(String accNum)
    {
        return getBalance(accNum);
    }

    public boolean exists(String custName) {
        return true;
    }
}
