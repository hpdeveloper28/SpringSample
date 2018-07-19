package com.springsample.importconfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MyDbConfiguration.class, MyBusinessConfiguration.class})
public class MyAppConfiguration {

}
