package com.demoStructure.bridge.implementor;

/**
 * 桥模式_实现接口_普通邮件
 * 
 * @author popkidorc
 * 
 */
public class MyImplementorEmailSample extends MyImplementorEmail {

	public MyImplementorEmailSample(String content) {
		super(content);
	}

	@Override
	public void send() {
		System.out.println("普通邮件:" + getContent());
	}

}
