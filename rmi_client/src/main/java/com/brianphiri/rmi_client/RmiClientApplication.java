package com.brianphiri.rmi_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@Configuration
//@SpringBootApplication
public class RmiClientApplication {

	@Bean
	public OrderBean orderBean(){
		return new OrderBean();
	}

	public static void main(String[] args) {
//		SpringApplication.run(RmiClientApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RmiClientApplication.class);
		OrderBean bean = context.getBean(OrderBean.class);
		bean.addItem();
		bean.getAllOrders();
	}

	@Bean
	public RmiProxyFactoryBean exporter() throws UnknownHostException{
		RmiProxyFactoryBean rmiProxyFactoryBean = 	new RmiProxyFactoryBean();
		rmiProxyFactoryBean.setServiceInterface(OrderService.class);
		String hostAddres = Inet4Address.getLocalHost().getHostAddress();
		rmiProxyFactoryBean.setServiceUrl(String.format("rmi://%s:2000/OrderService",hostAddres));
		return rmiProxyFactoryBean;
	}

}
