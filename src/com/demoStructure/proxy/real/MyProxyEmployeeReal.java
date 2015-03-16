package com.demoStructure.proxy.real;

/**
 * 代理模式_实际类_员工
 * 
 * @author popkidorc
 * 
 */
public class MyProxyEmployeeReal implements IMyProxyEmployeeReal {

	@Override
	public String searchEmployees() {
		System.out.println("接口执行：searchEmployees");
		return "{\"U0001\":\"张三\",\"U0002\":\"李四\",\"U0003\":\"王五\"}";
	}

	@Override
	public String searchEmployeeOrgans() {
		System.out.println("接口执行：searchEmployeeOrgans");
		return "{\"U0001\":\"D001\",\"U0002\":\"D002\",\"U0003\":\"D002\"}";
	}

}
