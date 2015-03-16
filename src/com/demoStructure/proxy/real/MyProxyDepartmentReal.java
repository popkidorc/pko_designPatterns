package com.demoStructure.proxy.real;

/**
 * 代理模式_实际类_部门
 * 
 * @author popkidorc
 * 
 */
public class MyProxyDepartmentReal implements IMyProxyDepartmentReal {

	@Override
	public String searchDepartments() {
		System.out.println("接口执行：searchDepartments");
		return "{\"D001\":\"总经理办公室\",\"D002\":\"财务部\"}";
	}

}
