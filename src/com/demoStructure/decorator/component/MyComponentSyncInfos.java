package com.demoStructure.decorator.component;

/**
 * 装饰模式_原有类
 * 
 * @author popkidorc
 * 
 */
public class MyComponentSyncInfos implements IMyComponentSyncInfos {

	public MyComponentSyncInfos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String syncUserInfos() {
		return "{\"U0001\":\"张三\",\"U0002\":\"李四\",\"U0003\":\"王五\"}";
	}

}
