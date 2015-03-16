package com.demoFound.builder.director;

import com.demoFound.builder.builder.IMyExceptionBuilder;

/**
 * 构造模式_指导者类
 * 
 * @author popkidorc
 * 
 */
public class MyExceptionDirector {

	// 指挥构造，这里指挥IMyExceptionBuilder创建异常对象
	public void buildException(IMyExceptionBuilder myExceptionBuilder) {
		myExceptionBuilder.addExceptionCode();
		myExceptionBuilder.addExceptionMessageCN();
		myExceptionBuilder.addExceptionMessageUS();
	}
}
