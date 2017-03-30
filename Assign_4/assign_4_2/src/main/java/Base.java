/**
 * Created by S.Effendi on 2017/03/30.
 */
public class Base {

    private String flavour;
    private String filling;

    public Base(String flav, String fill) {
        this.flavour = flav;
        this.filling = fill;
    }

    public String getFlavour(){
        return flavour;
    }
    public void setFlavour(String flavour){
        this.flavour = flavour;
    }

    public String getFilling(){
        return filling;
    }
    public void setFilling(String Filling){
        this.filling = filling;
    }

}
