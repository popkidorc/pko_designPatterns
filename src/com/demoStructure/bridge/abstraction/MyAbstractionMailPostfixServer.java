package com.demoStructure.bridge.abstraction;

import com.demoStructure.bridge.implementor.IMyImplementorEmail;

/**
 * 桥模式_抽象角色_postfix服务器
 * 
 * @author popkidorc
 * 
 */
public class MyAbstractionMailPostfixServer extends IMyAbstractionMailServer {

	public MyAbstractionMailPostfixServer(IMyImplementorEmail myImplementorEmail) {
		super(myImplementorEmail);
	}

	/**
	 * 发送邮件
	 */
	public void sendMail() {
		System.out.println("====发送邮件_使用postfix服务器====");
		myImplementorEmail.send();
	}
}
