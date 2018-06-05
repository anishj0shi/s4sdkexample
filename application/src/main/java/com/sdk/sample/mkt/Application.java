package com.sdk.sample.mkt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.s4sdkexample.mkt.payloads.services.DefaultMktInteractionSrvService;
import com.s4sdkexample.mkt.payloads.services.MktInteractionSrvService;

@SpringBootApplication
@ComponentScan({ "com.sap.cloud.sdk", "com.sdk.sample.mkt" })
@ServletComponentScan({ "com.sap.cloud.sdk", "com.sdk.sample.mkt" })
public class Application extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public MktInteractionSrvService interactionService() {
		return new DefaultMktInteractionSrvService();
	}
}
