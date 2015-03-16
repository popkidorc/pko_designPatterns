package com.demoFound.factoryMethod.factory;

import com.demoFound.factoryMethod.message.IMyMessage;

/**
 * 工厂方法模式_工厂接口
 * 
 * @author popkidorc
 * 
 */
public interface IMyMessageFactory {

	public IMyMessage createMessage(String messageType);
}
