package com.example.demo;

import com.example.demo.wsdl.TerytWs1;

import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.soap.AddressingFeature;


public class TerytApiClient {
	
	public static void search(String miejscowosc) {
		
		TerytWs1 t = new TerytWs1();
		t.setHandlerResolver(new TerytHandler());
		WebServiceFeature wsAddressing = new AddressingFeature(true);
		
	
		
		System.out.println(t.getCustom(wsAddressing).wyszukajMiejscowosc(miejscowosc, "").getMiejscowosc().size());
		System.out.println("kk");
		
		
	}

}
