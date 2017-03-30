package Config;

import Service.ImplDevSal;
import Service.ImplManagerSal;
import Service.SalService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by S.Effendi on 2017/03/30.
 */

@Configuration
public class AppConfig {

    @Bean(name = "DevSal")
    public SalService getDevSal(){
        return new ImplDevSal();
    }

    @Bean(name = "ManagerSal")
    public SalService getManagerSal(){
        return new ImplManagerSal();
    }
}
