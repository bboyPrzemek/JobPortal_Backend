package com.example.demo;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {
	
	@Autowired
	private ApiClient a;

	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		System.out.println(System.getProperty("java.runtime.version"));
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "99999");
		SpringApplication.run(DemoApplication.class, args);
	}
	

	 @Bean
	  public CommandLineRunner startup() {

	      return args -> {

	          System.out.print(
	        		  (
	        				  a.search("Koszalin"))
	        		  .getWyszukajMiejscowoscResult().getValue().getMiejscowosc().get(0).getWojewodztwo().getValue());

	      };

	
	
	 }

}
