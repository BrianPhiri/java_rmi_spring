//package com.brianphiri.rmi;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.remoting.rmi.RmiServiceExporter;
//
//import java.net.UnknownHostException;
//
//public class testRmi {
//
//    public static void main(String[] args) {
//        SpringApplication.run(RmiApplication.class, args);
//    }
//
//    @Bean
//    public RmiServiceExporter exporter() throws UnknownHostException {
//        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
//        rmiServiceExporter.setServiceName("OrderService");
//        rmiServiceExporter.setService(new OrderServiceImpl());
//        rmiServiceExporter.setService(2000);
//        return rmiServiceExporter;
//    }
//
//    @Bean
//    public OrderService orderService(){
//        return new OrderServiceImpl();
//    }
//}
