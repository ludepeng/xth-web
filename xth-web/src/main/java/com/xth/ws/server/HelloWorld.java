package com.xth.ws.server;

import javax.jws.WebService;

import com.xth.ws.model.User;

@WebService
public interface HelloWorld {

	public String sayHi(String text);

	public String sayWho(User user);
}
