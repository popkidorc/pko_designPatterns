package com.demoFound.builder.builder;

import com.demoFound.builder.exception.MyAbstractException;
import com.demoFound.builder.exception.MyExceptionSimple;

/**
 * 构造模式_构造者实现类_检出异常
 * 
 * @author popkidorc
 * 
 */
public class MyExceptionCheckOutBuilder implements IMyExceptionBuilder {

	private MyAbstractException myException;

	public MyExceptionCheckOutBuilder() {
		myException = new MyExceptionSimple();
	}

	@Override
	public void addExceptionCode() {
		myException.setExceptionCode("10002");
	}

	@Override
	public void addExceptionMessageCN() {
		myException.setExceptionMessageCN("实体已被检出，无法操作");
	}

	@Override
	public void addExceptionMessageUS() {
		myException.setExceptionMessageUS("this entity has been checked out");
	}

	@Override
	public MyAbstractException getResult() {
		return myException;
	}

}
