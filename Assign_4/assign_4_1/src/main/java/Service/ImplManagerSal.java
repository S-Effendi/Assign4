package Service;

import Domain.EmployeeSal;
import Domain.ManagerSal;

/**
 * Created by S.Effendi on 2017/03/30.
 */
public class ImplManagerSal extends EmployeeSal implements SalService{
    public EmployeeSal getSalary(){
        EmployeeSal manager = new ManagerSal("Wendy Williams", "21446780", 55000.0);
        return manager;
    }
}
