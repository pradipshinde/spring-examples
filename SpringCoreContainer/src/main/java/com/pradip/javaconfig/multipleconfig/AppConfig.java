package com.pradip.javaconfig.multipleconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({StudentConfig.class,EmployeeConfig.class})
public class AppConfig {

}
