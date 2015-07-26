package com.xth.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() {
		System.out.println("nimaaaa");
		return SUCCESS;
	}

}
