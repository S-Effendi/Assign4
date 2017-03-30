package CorePrincipalsTest;

import Config.AppConfig;
import Domain.EmployeeSal;
import Service.SalService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by S.Effendi on 2017/03/30.
 */
public class CorePrinciplesTest {

    private SalService salary;

    @Before
    public void setUp() throws Exception{
        ApplicationContext appcon = new AnnotationConfigApplicationContext(AppConfig.class);
        salary = (SalService)appcon.getBean("ManagerSal");
    }

    @Test
    public void corePrincipalTest() throws Exception {
        EmployeeSal employee = salary.getSalary();
        System.out.println("Annual Salary:R " +salary.getSalary().calAnnualSal());

        Assert.assertNotNull(employee.getEmpName());
    }
}
