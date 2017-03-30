package violate;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class GeneralBeeViolate {
    WorkerBeeViolate wbee;
    SergentWorkerBeeViolate swbee;

    public void setWorkerBee(WorkerBeeViolate wbee) {
        this.wbee = wbee;
    }

    public void setSergentWorkerBee(SergentWorkerBeeViolate swbee){
        this.swbee = swbee;
    }

    public void manage()
    {
        wbee.work();
    }
}
