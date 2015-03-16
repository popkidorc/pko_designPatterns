package com.demoStructure.atapter.adapter;

import com.demoStructure.atapter.adaptee.MyAdapteeGenerateUUID;
import com.demoStructure.atapter.target.IMyTargetGenerateUUID;

/**
 * 适配器模式_适配类
 * 
 * @author popkidorc
 * 
 */
public class MyAdapterGenerateUUID implements IMyTargetGenerateUUID {

	// 当然如果要适配static方法，就不用创建该对象。这里可以用构造型模式进行构造。
	private MyAdapteeGenerateUUID myAdapteeGenerateUUID = new MyAdapteeGenerateUUID();

	@Override
	public String generateUUID() {
		// 原来是使用：return UUID.randomUUID().toString();
		// 适配器模式一般用在系统改造或者升级中，不想直接修改原有实现
		return myAdapteeGenerateUUID.createMaxNum("0");
	}

}
