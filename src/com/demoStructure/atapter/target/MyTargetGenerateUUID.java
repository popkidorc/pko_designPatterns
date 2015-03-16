package com.demoStructure.atapter.target;

import java.util.UUID;

/**
 * 适配器模式_原有的实现目标接口的类
 * 
 * @author popkidorc
 * 
 */
public class MyTargetGenerateUUID implements IMyTargetGenerateUUID {

	// 这个类仅作实例，不是模式中的一环
	@Override
	public String generateUUID() {
		return UUID.randomUUID().toString();
	}

}
