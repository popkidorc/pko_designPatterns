package com.demoFound.abstractFactory.message;

import java.util.Map;

/**
 * 抽象工厂模式_产品接口
 * 
 * @author popkidorc
 * 
 */
public interface IMyMessage {

	public Map<String, Object> getMessageParam();

	public void setMessageParam(Map<String, Object> messageParam);

	public void sendMesage() throws Exception;// 发送通知/消息

}
