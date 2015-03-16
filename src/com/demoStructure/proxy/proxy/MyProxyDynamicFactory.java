package com.demoStructure.proxy.proxy;

import java.lang.reflect.Proxy;

/**
 * 代理模式_动态代理类
 * 
 * @author popkidorc
 * 
 */
public class MyProxyDynamicFactory {

	// 使用泛型构造代理对象，也可以使用普通工厂方法模式，当然也可以不用工厂模式
	public static <T> T newProxyInstance(Class<T> clazz) {
		MyProxyDynamic proxy = new MyProxyDynamic();
		Object object;
		try {
			object = clazz.newInstance();
			proxy.setObject(object);
		} catch (InstantiationException e) {
			System.out.println("实例化失败：" + clazz.getName());
		} catch (IllegalAccessException e) {
			System.out.println("获取信息失败：" + clazz.getName());
		}
		Object proxyImpl = Proxy.newProxyInstance(clazz.getClassLoader(),
				clazz.getInterfaces(), proxy);
		return (T) proxyImpl;
	}
}
