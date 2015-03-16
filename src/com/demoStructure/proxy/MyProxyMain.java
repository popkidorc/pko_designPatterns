package com.demoStructure.proxy;

import com.demoStructure.proxy.proxy.MyProxyDepartmentProxy;
import com.demoStructure.proxy.proxy.MyProxyDynamicFactory;
import com.demoStructure.proxy.proxy.MyProxyEmployProxy;
import com.demoStructure.proxy.real.IMyProxyDepartmentReal;
import com.demoStructure.proxy.real.IMyProxyEmployeeReal;
import com.demoStructure.proxy.real.MyProxyDepartmentReal;
import com.demoStructure.proxy.real.MyProxyEmployeeReal;

/**
 * 代理模式_消费者类
 * 
 * @author popkidorc
 * 
 */
public class MyProxyMain {

	public static void main(String[] args) {
		// 普通代理模式，一个实际类接口使用一个代理，当然这个接口可以有多个实现类
		System.out.println("======代理 start======");
		IMyProxyDepartmentReal myProxyDepartmentProxy = new MyProxyDepartmentProxy();
		IMyProxyEmployeeReal myProxyEmployProxy = new MyProxyEmployProxy();
		System.out.println("执行结果：" + myProxyDepartmentProxy.searchDepartments()
				+ "==" + myProxyEmployProxy.searchEmployees() + "=="
				+ myProxyEmployProxy.searchEmployeeOrgans());
		System.out.println("======代理 end======");

		// 动态代理模式，多个实际类接口共同使用一个代理
		System.out.println("\n======动态代理 start======");
		IMyProxyDepartmentReal myProxyDepartmentReal = MyProxyDynamicFactory
				.newProxyInstance(MyProxyDepartmentReal.class);
		String departments = myProxyDepartmentReal.searchDepartments();
		IMyProxyEmployeeReal myProxyEmployeeReal = MyProxyDynamicFactory
				.newProxyInstance(MyProxyEmployeeReal.class);
		String Employees = myProxyEmployeeReal.searchEmployees() + "=="
				+ myProxyEmployeeReal.searchEmployeeOrgans();
		System.out.println("执行结果：" + departments + "==" + Employees);
		System.out.println("======动态代理 end======");
	}
}
