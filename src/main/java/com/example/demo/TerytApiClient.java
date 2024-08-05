package com.example.demo;

import com.example.demo.wsdl.TerytWs1;


public class TerytApiClient {
	
	public static void search(String miejscowosc) {
		
		TerytWs1 t = new TerytWs1();
		t.setHandlerResolver(new TerytHandler());
	
		
		System.out.println(t.getCustom().wyszukajMiejscowosc(miejscowosc, "").getMiejscowosc().size());
		System.out.println("kk");
		
		
	}

}
