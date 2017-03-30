package violate;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class RectangleViolate {
    private int length;
    private int breadth;

    public RectangleViolate(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getBreadth(){
        return breadth ;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }

    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
}