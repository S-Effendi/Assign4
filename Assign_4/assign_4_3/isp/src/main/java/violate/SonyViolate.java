package violate;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class SonyViolate implements CellServiceViolate{
    public void sendIt() {
        System.out.println("Sending Text...");
    }

    public void receiveIt() {
        System.out.println("Receiving Text...");
    }

    public void connectIt() {
        System.out.println("Connecting to internet...");
    }

    public void uploadIt() {
        System.out.println("Uploading image...");
    }
}
