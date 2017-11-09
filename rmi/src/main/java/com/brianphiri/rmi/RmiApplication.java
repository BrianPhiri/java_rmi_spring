package com.brianphiri.rmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;

import java.rmi.UnknownHostException;

@SpringBootApplication
public class RmiApplication {

	@Bean
	public OrderService orderService(){
		return new OrderServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(RmiApplication.class, args);
	}

	@Bean
	public RmiServiceExporter exporter() throws UnknownHostException{
		RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
		rmiServiceExporter.setServiceName("OrderService");
		rmiServiceExporter.setService(orderService());
		rmiServiceExporter.setServiceInterface(OrderService.class);
		rmiServiceExporter.setRegistryPort(2000);
		return rmiServiceExporter;
	}
}
