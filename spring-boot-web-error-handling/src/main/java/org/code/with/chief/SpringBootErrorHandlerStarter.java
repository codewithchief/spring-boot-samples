package org.code.with.chief;

import org.code.with.chief.error.CustomErrorAttributes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringBootErrorHandlerStarter {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootErrorHandlerStarter.class, args);		
	}
	
	@Bean
	public ErrorAttributeOptions errorAttributeOptions(){
		return ErrorAttributeOptions.of(
				ErrorAttributeOptions.Include.EXCEPTION,
				ErrorAttributeOptions.Include.MESSAGE, 
				ErrorAttributeOptions.Include.STACK_TRACE,
				ErrorAttributeOptions.Include.BINDING_ERRORS
				);
	}
	
	@Bean
	public CustomErrorAttributes errorAttributes() {
		return new CustomErrorAttributes();
	}

}
