package com.xth.ws.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class InInterceptor extends AbstractPhaseInterceptor<Message> {

	public InInterceptor() {
		super(Phase.RECEIVE);
	}

	public InInterceptor(String phase) {
		super(phase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		// TODO Auto-generated method stub
		System.out.println("in interceptor");

	}

}
