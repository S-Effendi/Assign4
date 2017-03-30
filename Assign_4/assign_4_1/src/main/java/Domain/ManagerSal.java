package Domain;

/**
 * Created by S.Effendi on 2017/03/30.
 * Example of polymorphism
 * Managers Salary "IS A" Employees salary and "IS A" salary service.
 */

public class ManagerSal extends EmployeeSal{
    public ManagerSal(String empName, String empNum, double monthlySal){
        super.setEmpName(empName);
        super.setEmpNum(empNum);
        super.setMonthlySal(monthlySal);
    }
}