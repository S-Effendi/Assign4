package Domain;

/**
 * Created by S.Effendi on 2017/03/30.
 * Example of polymorphism
 * Developers Salary "IS A" Employees salary and "IS A" salary service.
 */
public class DevSal extends EmployeeSal{
    public DevSal(String empName, String empNum, double monthlySal){
        super.setEmpName(empName);
        super.setEmpNum(empNum);
        super.setMonthlySal(monthlySal);
    }
}
