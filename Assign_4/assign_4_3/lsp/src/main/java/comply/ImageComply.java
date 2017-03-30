package comply;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class ImageComply extends TextComply{
    public void sendIt(int name1, int name2, int name3)
    {
        super.sendIt(name1);
        System.out.println("Sending image to contact 1...");
    }
}
