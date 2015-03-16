package com.demoStructure.decorator;

import com.demoStructure.decorator.component.IMyComponentSyncInfos;
import com.demoStructure.decorator.component.MyComponentSyncInfos;
import com.demoStructure.decorator.decorator.MyDecoratorSyncInfosCost;

/**
 * 装饰模式_装饰类_成本核算模块使用
 * 
 * @author popkidorc
 * 
 */
public class MyDecoratorMain {
	// 这里我们假设这个对象是注入的。
	private static IMyComponentSyncInfos myComponentSyncInfos = new MyComponentSyncInfos();

	public static void main(String[] args) {
		// 原功能
		System.out.println("==old==" + myComponentSyncInfos.syncUserInfos());

		// 某系统需要对用户名称进行加密
		myComponentSyncInfos = new MyDecoratorSyncInfosCost(
				myComponentSyncInfos);
		System.out.println("==new==" + myComponentSyncInfos.syncUserInfos());
	}

}
