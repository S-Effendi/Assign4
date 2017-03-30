package comply;

/**
 * Created by S.Effendi on 2017/03/30.
 */
public class ShopOperationsComply {
    private ShopServiceComply shopServiceComply;

    public ShopOperationsComply(ShopServiceComply shopServiceComply)
    {
        this.shopServiceComply = shopServiceComply;
    }

    public void AccActions()
    {
        shopServiceComply.getCustBalance("2575");
    }
}
