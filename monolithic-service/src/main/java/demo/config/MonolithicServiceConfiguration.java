package demo.config;

import demo.CatalogServiceConfiguration;
//import demo.InventoryApplication;
import demo.OrderServiceConfig;
import demo.UserServiceConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import({UserApplication.class})
//@Import({UserApplication.class, InventoryApplication.class})
@Import({UserServiceConfiguration.class, CatalogServiceConfiguration.class, OrderServiceConfig.class})
//@Import({CatalogServiceApplication.class})
@EnableAutoConfiguration
@ComponentScan
public class MonolithicServiceConfiguration
{

}
