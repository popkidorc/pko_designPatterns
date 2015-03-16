package com.demoStructure.bridge.abstraction;

import com.demoStructure.bridge.implementor.IMyImplementorEmail;

/**
 * 桥模式_抽象接口
 * 
 * @author popkidorc
 * 
 */
public abstract class IMyAbstractionMailServer {

	protected IMyImplementorEmail myImplementorEmail;

	/**
	 * 构造方法
	 * 
	 * @param myImplementorEmail
	 */
	public IMyAbstractionMailServer(IMyImplementorEmail myImplementorEmail) {
		this.myImplementorEmail = myImplementorEmail;
	}

	/**
	 * 发送邮件
	 */
	public abstract void sendMail();
}
