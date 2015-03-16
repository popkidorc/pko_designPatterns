package com.demoFound.abstractFactory.message;

/**
 * 工厂方法模式_sms产品_提醒
 * 
 * @author popkidorc
 * 
 */
public class MyMessageSmsOnce extends MyAbstractMessageOnce {

	@Override
	public void sendMesage() throws Exception {
		// TODO Auto-generated method stub
		if (null == getMessageParam()
				|| null == getMessageParam().get("PHONENUM")
				|| "".equals(getMessageParam().get("PHONENUM"))) {
			throw new Exception("发送短信_提醒,需要传入PHONENUM参数");// 为了简单起见异常也不自定义了
		}// 另外短信信息，以及其他各种协议参数等等都要处理

		System.out.println("我是短信_提醒，发送通知给" + getMessageParam().get("PHONENUM"));
	}

}
