package com.demoStructure.proxy.proxy;

import com.demoStructure.proxy.real.IMyProxyDepartmentReal;
import com.demoStructure.proxy.real.MyProxyDepartmentReal;

/**
 * 代理模式_代理类_员工
 * 
 * @author popkidorc
 * 
 */
public class MyProxyDepartmentProxy implements IMyProxyDepartmentReal {

	/*
	 * 普通代理模式 和 装饰模式 几乎一致。
	 * 可以将普通代理模式(静态)当做比较特殊的装饰模式。实际使用中也很难区分，当然也没有必要区分，按照需求灵活使用即可。
	 * 
	 * 相同点：都是通过对象的套壳完成对对象的控制、操作以及功能的追加。
	 * 
	 * 不同点：代理模式注重控制（一般消费者不会直接访问被代理类），而装饰模式注重扩展（消费者也可以直接访问被装饰的类，但是装饰类的功能更多）。
	 */
	/*
	 * 普通代理模式 和 对象适配器模式 几乎一致。
	 * 
	 * 相同点：都是通过对象的套壳完成对对象的操作。
	 * 
	 * 不同点：代理模式注重控制（一般消费者不会直接访问被代理类，），而装饰模式注重扩展（消费者也可以直接访问被装饰的类，但是装饰类的功能更多）。
	 */
	private MyProxyDepartmentReal myProxyDepartment;

	// 构造方法
	public MyProxyDepartmentProxy() {
		super();
		if (null == myProxyDepartment) {
			myProxyDepartment = new MyProxyDepartmentReal();
		}
	}

	@Override
	public String searchDepartments() {
		doBefore();
		String result = myProxyDepartment.searchDepartments();
		doAfter();
		return result;
	}

	// doBefore、doAfter可以根据不同实际类的要求，继承后重写。这里仅作示例
	private void doBefore() {
		System.out.println("接口执行前执行==创建批次信息，赋权");
	}

	private void doAfter() {
		System.out.println("接口执行后执行==运行入库后运算、同步至其他系统");
	}
}
