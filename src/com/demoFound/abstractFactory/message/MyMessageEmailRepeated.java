package com.demoFound.abstractFactory.message;

/**
 * 工厂方法模式_email产品_催办
 * 
 * @author popkidorc
 * 
 */
public class MyMessageEmailRepeated extends MyAbstractMessageRepeated {

	@Override
	public void sendMesage() throws Exception {
		// TODO Auto-generated method stub
		if (null == getMessageParam() || null == getMessageParam().get("EMAIL")
				|| "".equals(getMessageParam().get("EMAIL"))) {
			throw new Exception("发送邮件_催办,需要传入EMAIL参数");// 为了简单起见异常也不自定义了
		}// 另外邮件内容，以及其他各种协议参数等等都要处理

		System.out.println("我是邮件_催办，发送通知给" + getMessageParam().get("EMAIL"));
	}

}
