package comply;

import violate.cupcakeToppingViolate;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class cupcakeComply {
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

}
