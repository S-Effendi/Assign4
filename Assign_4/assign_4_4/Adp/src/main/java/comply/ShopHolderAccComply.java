package comply;

/**
 * Created by S.Effendi on 2017/03/30.
 */
public class ShopHolderAccComply {
    public void payAcc(ShopServiceComply shopServiceComply, String custName, double paymentAmnt)
    {
        if(shopServiceComply.exists("Wendy"))
        {
            System.out.println("Amount R" + paymentAmnt + " has been credited to Mrs. " + custName);
        }
    }

    public double getBalance(String accNum)
    {
        System.out.println("Balance");
        return 1.0;
    }
}
