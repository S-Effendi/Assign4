/**
 * Created by S.Effendi on 2017/03/30.
 */
public class Cake {

    private String name;
    private Base base;
    private Topping topping;

    public Cake(String name, String flav, String fill, String type, boolean icing){
        this.name = name;
        this.base = new Base(flav, fill);
        this.topping = new Topping(type, icing);
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Base getBase(){
        return base;
    }
    public void setBase(String flav, String fill){
        this.base = new Base(flav, fill);
    }

    public Topping getTopping(){
        return topping;
    }
    public void setTopping(String type, Boolean icing){
        this.topping = new Topping(type, icing);
    }

    @Override
    public String toString(){
        return "Cake: " + name + "\nFlavour: " + base.getFlavour() + "\nFilling: " + base.getFilling() + "\nType: " + topping.getType() + "\nIcing: " + topping.isIcing();
    }

}
