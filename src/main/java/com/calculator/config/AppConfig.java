package com.calculator.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @version 1.0
 * @autor a2driano
 * @project: calculator
 * @since 23.02.2016
 */
@Configuration
@ComponentScan(basePackages = {
        "com.calculator"
})
@Import({WebMvcConfig.class})
public class AppConfig {

}
