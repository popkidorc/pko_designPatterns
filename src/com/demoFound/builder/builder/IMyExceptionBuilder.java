package com.demoFound.builder.builder;

import com.demoFound.builder.exception.MyAbstractException;

/**
 * 构造模式_构造者接口
 * 
 * @author popkidorc
 * 
 */
public interface IMyExceptionBuilder {

	// 与其他系统集成时，有可能会要求不同语言版本的异常信息。若使用构造模式，添加一种预拌版本消费者完全无察觉，只需要调整builder和director即可

	// 异常编码
	public void addExceptionCode();

	// 异常中文描述
	public void addExceptionMessageCN();

	// 异常英文描述
	public void addExceptionMessageUS();

	public MyAbstractException getResult();
}
