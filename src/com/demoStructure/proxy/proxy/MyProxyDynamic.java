package com.demoStructure.proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理模式_动态代理类
 * 
 * @author popkidorc
 * 
 */
public class MyProxyDynamic implements InvocationHandler {

	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		doBefore();
		// 执行实际类的方法
		if (object == null) {
			throw new Exception("实际对象 is null");
		}
		Object result = method.invoke(object, args);
		doAfter();
		return result;
	}

	// doBefore、doAfter可以根据不同实际类的要求，继承后重写。这里仅作示例
	private void doBefore() {
		System.out.println("接口执行前执行==创建批次信息");
	}

	private void doAfter() {
		System.out.println("接口执行后执行==运行入库后运算、同步至其他系统");
	}
}
