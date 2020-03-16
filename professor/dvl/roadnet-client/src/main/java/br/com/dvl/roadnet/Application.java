package br.com.dvl.roadnet;

import org.datacontract.schemas._2004._07.roadnet_apex_server_services_login.LicenseComplianceViolationInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_login.ObjectFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan( basePackageClasses = { })
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		
		ObjectFactory factory = new ObjectFactory();
		final LicenseComplianceViolationInfo l = factory.createLicenseComplianceViolationInfo();
		
	}
}
