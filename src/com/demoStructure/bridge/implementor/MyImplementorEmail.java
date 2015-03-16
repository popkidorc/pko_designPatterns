package com.demoStructure.bridge.implementor;

/**
 * 桥模式_实现接口_抽象邮件
 * 
 * @author popkidorc
 * 
 */
public abstract class MyImplementorEmail implements IMyImplementorEmail {
	private String content;

	/**
	 * 构造一个邮件
	 * 
	 * @param content
	 */
	public MyImplementorEmail(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

}
