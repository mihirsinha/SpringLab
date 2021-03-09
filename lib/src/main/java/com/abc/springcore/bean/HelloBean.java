package com.abc.springcore.bean;

public class HelloBean {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	void sayHello()
	{
		System.out.println(message);
	}

}
