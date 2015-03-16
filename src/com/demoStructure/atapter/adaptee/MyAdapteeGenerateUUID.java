package com.demoStructure.atapter.adaptee;

/**
 * 适配器模式_被适配类
 * 
 * @author popkidorc
 * 
 */
public class MyAdapteeGenerateUUID {
	/**
	 * 模拟第三方工具的生成方法，不同的numType有不同的规则
	 * 
	 * @param params
	 * @return
	 */
	public String createMaxNum(String numType) {
		return numType.hashCode() + "(模拟由第三方工具生成的最大号)";
	}
}
