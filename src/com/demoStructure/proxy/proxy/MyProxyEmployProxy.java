package com.demoStructure.proxy.proxy;

import com.demoStructure.proxy.real.IMyProxyEmployeeReal;
import com.demoStructure.proxy.real.MyProxyEmployeeReal;

/**
 * 代理模式_代理类_员工
 * 
 * @author popkidorc
 * 
 */
public class MyProxyEmployProxy implements IMyProxyEmployeeReal {

	private MyProxyEmployeeReal myProxyEmployeeReal;

	// 构造方法
	public MyProxyEmployProxy() {
		super();
		if (null == myProxyEmployeeReal) {
			myProxyEmployeeReal = new MyProxyEmployeeReal();
		}
	}

	@Override
	public String searchEmployees() {
		doBefore();
		String result = myProxyEmployeeReal.searchEmployees();
		doAfter();
		return result;
	}

	@Override
	public String searchEmployeeOrgans() {
		doBefore();
		String result = myProxyEmployeeReal.searchEmployeeOrgans();
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
