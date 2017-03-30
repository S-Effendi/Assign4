package Domain;

import java.io.Serializable;

/**
 * Created by S.Effendi on 2017/03/30.
    This is an example of encapsulation and inheritance*/
abstract public class EmployeeSal implements Serializable{
    private String empName;
    private String empNum;
    private double monthlySal;
    private double annualSal;

    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    public double getMonthlySal() {
        return monthlySal;
    }

    public void setMonthlySal(double monthlySal) {
        this.monthlySal = monthlySal;
    }

    public double calAnnualSal()
    {
        this.annualSal = monthlySal*12;
        return annualSal;
    }
}
