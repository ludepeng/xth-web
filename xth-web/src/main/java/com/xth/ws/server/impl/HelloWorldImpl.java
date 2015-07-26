package com.xth.ws.server.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import javax.jws.WebService;

import com.xth.ws.model.User;
import com.xth.ws.server.HelloWorld;

@WebService(endpointInterface = "com.xth.ws.server.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHi(String text) {
		return "Hello, " + text;
	}

	@Override
	public String sayWho(User user) {
		StringBuilder sb = new StringBuilder();
		sb.append("userName:").append(user.getUserName());
		for (HashMap<String, String> entry : user.getBooks().getEntry()) {
			Set<String> keySet = entry.keySet();
			Collection<String> values = entry.values();
		}
		return sb.toString();
	}

}
