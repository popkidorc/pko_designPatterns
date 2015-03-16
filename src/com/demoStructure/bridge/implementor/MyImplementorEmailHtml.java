package com.demoStructure.bridge.implementor;

/**
 * 桥模式_实现接口_html邮件
 * 
 * @author popkidorc
 * 
 */
public class MyImplementorEmailHtml extends MyImplementorEmail {

	public MyImplementorEmailHtml(String content) {
		super(content);
	}

	@Override
	public void send() {
		System.out.println("<HTML>html邮件" + getContent() + "</HTML>");
	}

}
