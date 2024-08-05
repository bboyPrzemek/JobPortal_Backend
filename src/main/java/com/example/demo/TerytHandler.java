package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.ws.handler.Handler;
import jakarta.xml.ws.handler.HandlerResolver;
import jakarta.xml.ws.handler.PortInfo;

public class TerytHandler implements HandlerResolver{

	@Override
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerList = new ArrayList<>();
		handlerList.add(new TerytApiHandler());
		return handlerList;
	}

}
