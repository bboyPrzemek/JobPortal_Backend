package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.xml.namespace.QName;


import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPFactory;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

public class TerytApiHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext smc)
    {
        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()){
            try{
                SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader(); 
                SOAPElement security = header.addChildElement("Security", "wsse", 
                        "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
                SOAPElement usernameToken = security.addChildElement("UsernameToken", "wsse");
                SOAPElement username = usernameToken.addChildElement("Username", "wsse");
                username.addTextNode("TestPubliczny");
                SOAPElement password = usernameToken.addChildElement("Password", "wsse");
                password.setAttribute("Type",
                        "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
                password.addTextNode("1234abcd");
            } catch (Exception e){
                e.printStackTrace();
            }
        } else{
            //This handler does nothing with the response from the Web Service
            //even though it should probably check its mustUnderstand headers
            SOAPMessage message = smc.getMessage();
        }
        return outboundProperty;
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
		 QName securityHeader = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", 
	                "Security"); 
	        HashSet<QName> headers = new HashSet<QName>(); 
	        headers.add(securityHeader);         
	        return headers; 
	}

}
