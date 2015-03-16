package com.demoFound.abstractFactory.factory;

import com.demoFound.abstractFactory.message.IMyMessage;

/**
 * 工厂方法模式_工厂接口
 * 
 * @author popkidorc
 * 
 */
public interface IMyMessageFactory {

	public IMyMessage createMessage(String messageType);

}
