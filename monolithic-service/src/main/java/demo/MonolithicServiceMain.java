package demo;

import demo.config.MonolithicServiceConfiguration;
import org.springframework.boot.SpringApplication;

public class MonolithicServiceMain
{
    public static void main(String[] args)
    {
        SpringApplication.run(MonolithicServiceConfiguration.class, args);
    }
}
