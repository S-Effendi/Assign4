package comply;

/**
 * Created by S.Effendi on 2017/03/30.
 */
public interface ShopServiceComply {
    void payAcc(ShopServiceComply shopServiceComply, String custName, double paymentAmnt);
    double getBalance(String accNum);
    double getCustBalance(String accNum);
    boolean exists(String custName);
}
