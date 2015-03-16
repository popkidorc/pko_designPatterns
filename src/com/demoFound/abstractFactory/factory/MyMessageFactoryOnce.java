package com.demoFound.abstractFactory.factory;

import java.util.HashMap;
import java.util.Map;

import com.demoFound.abstractFactory.message.IMyMessage;
import com.demoFound.abstractFactory.message.MyMessageEmailOnce;
import com.demoFound.abstractFactory.message.MyMessageOaTodoOnce;
import com.demoFound.abstractFactory.message.MyMessageSmsOnce;

/**
 * 工厂方法模式_工厂实现_提醒
 * 
 * @author popkidorc
 * 
 */
public class MyMessageFactoryOnce implements IMyMessageFactory {
	// 这分为once和Repeated两种通知方式，一般业务首次办理会发送Once提醒，若办理人长时间没有办理，则每隔一段时间会发送Repeated催办
	@Override
	public IMyMessage createMessage(String messageType) {
		// 这里的方式是：消费者知道自己想要什么产品；若生产何种产品完全由工厂决定，则这里不应该传入控制生产的参数。
		IMyMessage myMessage;
		Map<String, Object> messageParam = new HashMap<String, Object>();
		// 根据某些条件去选择究竟创建哪一个具体的实现对象，条件可以传入的，也可以从其它途径获取。
		// sms
		if ("SMS".equals(messageType)) {
			myMessage = new MyMessageSmsOnce();
			messageParam.put("PHONENUM", "123456789");
		} else
		// OA待办
		if ("OA".equals(messageType)) {
			myMessage = new MyMessageOaTodoOnce();
			messageParam.put("OAUSERNAME", "testUser");
		} else
		// email
		if ("EMAIL".equals(messageType)) {
			myMessage = new MyMessageEmailOnce();
			messageParam.put("EMAIL", "test@test.com");
		} else
		// 默认生产email这个产品
		{
			myMessage = new MyMessageEmailOnce();
			messageParam.put("EMAIL", "test@test.com");
		}
		myMessage.setMessageParam(messageParam);
		return myMessage;
	}
}
