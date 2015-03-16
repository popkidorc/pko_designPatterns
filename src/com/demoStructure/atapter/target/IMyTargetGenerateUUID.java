package com.demoStructure.atapter.target;

/**
 * 适配器模式_适配目标接口
 * 
 * @author popkidorc
 * 
 */
public interface IMyTargetGenerateUUID {

	/**
	 * 
	 * 原先，系统使用java.UUID方式生成唯一标识
	 * 
	 * 现在，需要换成第三方工具的生成，而消费这个方法的地方太多，不想做太大改动，所以使用适配器进行适配。
	 * 
	 * @param params
	 * @param fileType
	 * @return
	 */
	public String generateUUID();
}
