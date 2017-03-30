package comply;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class RectangleComply extends Building{

    private int length;
    private int breadth;

    public RectangleComply(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int perimeter(){
        return (length + breadth)*2;
    }
}
