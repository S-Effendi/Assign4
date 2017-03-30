/**
 * Created by S.Effendi on 2017/03/30.
 */
public class Topping {

    private String type;
    private boolean icing;

    public  Topping(String type, boolean icing){
        this.type = type;
        this.icing = icing;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public boolean isIcing(){
        return icing;
    }
    public void setIcing(boolean icing){
        this.icing = icing;
    }

}
