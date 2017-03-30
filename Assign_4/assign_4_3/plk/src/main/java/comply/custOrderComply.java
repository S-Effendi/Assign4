package comply;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class custOrderComply {
    private cupcakeToppingComply ctop;
    private  cupcakeComply cc;

    public void orderCupcake()
    {
        cc = new cupcakeComply();
        cc.setPrice(15);
        cc.setStyle("Rosey");

        ctop = new cupcakeToppingComply();
        ctop.setFlavour("Vanilla");
        ctop.setPrice(3);
    }

    public void print()
    {
        System.out.println(cc.getStyle() + " cupcake with " + ctop.getFlavour());
        System.out.println("Total cost = R" + (cc.getPrice()+ ctop.getPrice()));
    }
}
