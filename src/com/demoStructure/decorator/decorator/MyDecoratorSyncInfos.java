package com.demoStructure.decorator.decorator;

import com.demoStructure.decorator.component.IMyComponentSyncInfos;

/**
 * 装饰模式_装饰基类
 * 
 * @author popkidorc
 * 
 */
public class MyDecoratorSyncInfos implements IMyComponentSyncInfos {

	// 这里和代理模式非常相似，只不过代理模式的对象由代理类生成，
	private IMyComponentSyncInfos myComponentSyncInfos;

	public MyDecoratorSyncInfos(IMyComponentSyncInfos myComponentSyncInfos) {
		super();
		this.myComponentSyncInfos = myComponentSyncInfos;
	}

	@Override
	public String syncUserInfos() {
		return myComponentSyncInfos.syncUserInfos();
	}

}
