package com.demoFound.singleton;

/**
 * 单例模式
 * 
 * @author popkidorc
 * 
 */
public class MySingleton {

	// 私有静态实例
	private static MySingleton newInstance = null;

	// 私有构造方法
	private MySingleton() {
	}

	// 对外的公用访问点，用来创建或获取实例
	public static synchronized MySingleton getInstance() {
		if (newInstance == null) {
			newInstance = new MySingleton();
		}
		return newInstance;
	}
}
