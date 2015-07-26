package com.xth.ws.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class OutInterceptor extends AbstractPhaseInterceptor<Message> {

	public OutInterceptor() {
		super(Phase.PRE_STREAM);
	}

	public OutInterceptor(String phase) {
		super(phase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleMessage(Message arg0) throws Fault {
		// TODO Auto-generated method stub
		System.out.println("out interceptor");
	}

}
