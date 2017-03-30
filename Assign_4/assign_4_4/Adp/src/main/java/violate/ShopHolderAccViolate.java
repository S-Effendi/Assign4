package violate;

/**
 * Created by S.Effendi on 2017/03/30.
 */
public class ShopHolderAccViolate {
    private CustViolate cust;

    public void payAcc(String custName, double paymentAmnt)
    {
        cust = new CustViolate();
        if(cust.exists(custName))
        {
            System.out.println("Amount R" + paymentAmnt + " has been credited to Mrs. " + custName);
        }
    }

    public double getBalance(String accNum)
    {
        System.out.println("Balance");
        return 0;
    }
}
