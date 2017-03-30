package violate;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class cupcakeViolate {
    private int price;
    private String style;
    private cupcakeToppingViolate ctop = new cupcakeToppingViolate();

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        this.style = style;
    }

    public cupcakeToppingViolate getTopping() {
        return ctop;
    }
    public void setTopping(cupcakeToppingViolate topping) {
        this.ctop = topping;
    }

    public void print()
    {
        System.out.println(getStyle() + " cupcake with " + ctop.getFlavour());
        System.out.println("Total cost = R" + (getPrice()+ ctop.getPrice()));
    }
}
