package com.demoFound.abstractFactory;

import com.demoFound.abstractFactory.factory.IMyMessageFactory;
import com.demoFound.abstractFactory.factory.MyMessageFactoryOnce;
import com.demoFound.abstractFactory.factory.MyMessageFactoryRepeated;
import com.demoFound.abstractFactory.message.IMyMessage;

/**
 * 工厂方法模式_消费者类
 * 
 * @author popkidorc
 * 
 */
public class MyAbstractFactoryMain {

	public static void main(String[] args) {
		IMyMessageFactory myMessageFactoryOnce = new MyMessageFactoryOnce();
		IMyMessageFactory myMessageFactoryRepeated = new MyMessageFactoryRepeated();
		IMyMessage myMessage;
		// 对于这个消费者来说，不用知道如何生产message这个产品，耦合度降低
		try {
			// 先来一个短信通知_提醒
			myMessage = myMessageFactoryOnce.createMessage("SMS");
			myMessage.sendMesage();

			// 来一个oa待办_提醒
			myMessage = myMessageFactoryOnce.createMessage("OA");
			myMessage.sendMesage();

			// 来一个邮件通知_提醒
			myMessage = myMessageFactoryOnce.createMessage("EMAIL");
			myMessage.sendMesage();

			// 先来一个短信通知_催办
			myMessage = myMessageFactoryRepeated.createMessage("SMS");
			myMessage.sendMesage();

			// 来一个oa待办_催办
			myMessage = myMessageFactoryRepeated.createMessage("OA");
			myMessage.sendMesage();

			// 来一个邮件通知_催办
			myMessage = myMessageFactoryRepeated.createMessage("EMAIL");
			myMessage.sendMesage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
