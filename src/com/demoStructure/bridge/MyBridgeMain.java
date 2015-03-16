package com.demoStructure.bridge;

import com.demoStructure.bridge.abstraction.IMyAbstractionMailServer;
import com.demoStructure.bridge.abstraction.MyAbstractionMailPostfixServer;
import com.demoStructure.bridge.abstraction.MyAbstractionMailSendMailServer;
import com.demoStructure.bridge.implementor.IMyImplementorEmail;
import com.demoStructure.bridge.implementor.MyImplementorEmailSample;

/**
 * 桥模式_消费者类
 * 
 * @author popkidorc
 * 
 */
public class MyBridgeMain {

	private static IMyImplementorEmail myImplementorEmail;

	private static IMyAbstractionMailServer myAbstractionMailServer;

	public static void main(String[] args) {

		myImplementorEmail = new MyImplementorEmailSample(
				"通知:春节假期02-13至03-01日，共17天");

		// 使用postfix发送 普通邮件
		myAbstractionMailServer = new MyAbstractionMailPostfixServer(
				myImplementorEmail);
		myAbstractionMailServer.sendMail();
		System.out.println();

		// 使用sendmail发送 普通邮件
		myAbstractionMailServer = new MyAbstractionMailSendMailServer(
				myImplementorEmail);
		myAbstractionMailServer.sendMail();
		System.out.println();

		myImplementorEmail = new MyImplementorEmailSample(
				"<P>通知:春节假期</P><table><tr><td>02-13</td><td>03-01</td><td>17天</td></tr>");

		// 使用postfix发送 html邮件
		myAbstractionMailServer = new MyAbstractionMailPostfixServer(
				myImplementorEmail);
		myAbstractionMailServer.sendMail();
		System.out.println();

		// 使用sendmail发送 html邮件
		myAbstractionMailServer = new MyAbstractionMailSendMailServer(
				myImplementorEmail);
		myAbstractionMailServer.sendMail();
		System.out.println();
	}

}
