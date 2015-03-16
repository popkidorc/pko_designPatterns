package com.demoFound.builder.builder;

import com.demoFound.builder.exception.MyAbstractException;
import com.demoFound.builder.exception.MyExceptionSimple;

/**
 * 构造模式_构造者实现类_找不到实体异常
 * 
 * @author popkidorc
 * 
 */
public class MyExceptionFindEntityBuilder implements IMyExceptionBuilder {

	private MyAbstractException myException;

	public MyExceptionFindEntityBuilder() {
		myException = new MyExceptionSimple();
	}

	@Override
	public void addExceptionCode() {
		myException.setExceptionCode("10001");
	}

	@Override
	public void addExceptionMessageCN() {
		myException.setExceptionMessageCN("实体无法找到");
	}

	@Override
	public void addExceptionMessageUS() {
		myException.setExceptionMessageUS("can not find the entity");
	}

	@Override
	public MyAbstractException getResult() {
		return myException;
	}

}
