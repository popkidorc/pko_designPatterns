package com.demoStructure.decorator.component;

/**
 * 装饰模式_原有接口
 * 
 * @author popkidorc
 * 
 */
public interface IMyComponentSyncInfos {
	// 系统已有接口，供其他模块调用，用来同步数据，提供user数据的同步

	/**
	 * 同步user数据
	 * 
	 * @return
	 */
	public String syncUserInfos();
}
