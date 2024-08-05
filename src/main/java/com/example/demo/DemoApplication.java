package com.example.demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.wsdl.ArrayOfMiejscowosc;
import com.example.demo.wsdl.ITerytWs1;
import com.example.demo.wsdl.Miejscowosc;
import com.example.demo.wsdl.ObjectFactory;
import com.example.demo.wsdl.TerytWs1;
import com.example.demo.wsdl.WyszukajJednostkeWRejestrze;
import com.example.demo.wsdl.WyszukajMiejscowosc;
import com.example.demo.wsdl.WyszukajMiejscowoscResponse;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.handler.Handler;
import jakarta.xml.ws.handler.HandlerResolver;
import jakarta.xml.ws.handler.PortInfo;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "9");
	
		System.setProperty("https.protocols", "SSLv3");
		TerytApiClient.search("Koszalin");
		

		SpringApplication.run(DemoApplication.class, args);
	}
	


}
