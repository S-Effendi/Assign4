package Service;

import Domain.DevSal;
import Domain.EmployeeSal;

/**
 * Created by S.Effendi on 2017/03/30.
 */
public class ImplDevSal extends EmployeeSal implements SalService{
    public EmployeeSal getSalary(){
        EmployeeSal developer = new DevSal("John Jacobs","214675022",25000.0);
        return developer;
    }
}
