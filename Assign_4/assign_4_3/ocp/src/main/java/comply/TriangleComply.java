package comply;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class TriangleComply extends Building{
    private int length;
    private int breadth;
    private int height;

    public TriangleComply(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public int perimeter(){
        return length + breadth + height;
    }
}
