package com.example.demo.terytapi;

import java.net.URISyntaxException;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.addressing.client.ActionCallback;
import com.example.demo.wsdl.ObjectFactory;
import com.example.demo.wsdl.WyszukajMiejscowosc;
import com.example.demo.wsdl.WyszukajMiejscowoscResponse;

public class TerytApiClient extends WebServiceGatewaySupport {
	
	public WyszukajMiejscowoscResponse search(String city) throws URISyntaxException {
		ObjectFactory objectFactory = new ObjectFactory();
		WyszukajMiejscowosc wyszukajMiejscowosc = new WyszukajMiejscowosc();
		wyszukajMiejscowosc.setNazwaMiejscowosci(objectFactory.createWyszukajMiejscowoscNazwaMiejscowosci(city));
		return (WyszukajMiejscowoscResponse)getWebServiceTemplate().marshalSendAndReceive(wyszukajMiejscowosc, new ActionCallback("http://tempuri.org/ITerytWs1/WyszukajMiejscowosc"));
	}
}
