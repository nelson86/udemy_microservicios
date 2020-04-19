package com.formacionbdi.springboot.app.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
// Necesario para que no de error x bd, ya que el proy la requiere
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class UdemyMicroservicioCommonsApplication {

}
