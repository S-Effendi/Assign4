package comply;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class GeneralBeeComply {

    BeeServiceComply wbee;

    public void setWorkerBee(BeeServiceComply wbee){
        this.wbee = wbee;
    }

    public void manage()
    {
        wbee.work();
    }
}
