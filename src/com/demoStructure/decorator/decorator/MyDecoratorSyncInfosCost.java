package com.demoStructure.decorator.decorator;

import com.demoStructure.decorator.component.IMyComponentSyncInfos;

/**
 * 装饰模式_装饰类_成本核算模块使用
 * 
 * @author popkidorc
 * 
 */
public class MyDecoratorSyncInfosCost extends MyDecoratorSyncInfos {
	// 这里只有一个装饰类，可以和MyDecoratorSyncInfos合并成一个。若是多个，则可以直接继承MyDecoratorSyncInfos
	public MyDecoratorSyncInfosCost(IMyComponentSyncInfos myComponentSyncInfos) {
		super(myComponentSyncInfos);
	}

	@Override
	public String syncUserInfos() {
		super.syncUserInfos();
		return "加密后：" + super.syncUserInfos().hashCode();// 用hashCode代替加密后的数据
	}

}
