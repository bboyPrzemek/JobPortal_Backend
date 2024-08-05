package com.example.demo;

import java.util.Set;

import javax.xml.namespace.QName;

import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPFactory;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

public class TerytApiHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		
		try {
		context.getMessage().getSOAPHeader().detachNode();
		System.out.println("Client : handleMessage()......");
		Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		System.out.println("isRequest="+isRequest);
		if(isRequest){
			String prefixUri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-";
	        String uri = prefixUri + "wssecurity-secext-1.0.xsd";
	        String uta = prefixUri + "wssecurity-utility-1.0.xsd";
	        String ta = prefixUri + "username-token-profile-1.0#PasswordText";
			SOAPEnvelope envelope;
			envelope = context.getMessage().getSOAPPart().getEnvelope();
			SOAPFactory factory = SOAPFactory.newInstance();
			String prefix = "wsse";
			SOAPElement securityElem = factory.createElement("Security",prefix,uri);
			SOAPElement tokenElem = factory.createElement("UsernameToken",prefix,uri);
			tokenElem.addAttribute(QName.valueOf("wsu:Id"),"UsernameToken");
			tokenElem.addAttribute(QName.valueOf("xmlns:wsu"), uta);
			SOAPElement userElem = factory.createElement("Username",prefix,uri);
			userElem.addTextNode("TestPubliczny");
			SOAPElement pwdElem = factory.createElement("Password",prefix,uri);
			pwdElem.addTextNode("1234abcd");
			pwdElem.addAttribute(QName.valueOf("Type"), ta);
			tokenElem.addChildElement(userElem);
			tokenElem.addChildElement(pwdElem);
			securityElem.addChildElement(tokenElem);
			SOAPHeader header = envelope.addHeader();
			header.addChildElement(securityElem);
		}
		}catch (Exception e) {
			System.out.println(e);
		}
		return true;
			
	
		
	}
		
		

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
