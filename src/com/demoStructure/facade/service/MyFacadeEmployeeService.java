package com.demoStructure.facade.service;

/**
 * 外观模式_员工信息服务类
 * 
 * @author popkidorc
 * 
 */
public class MyFacadeEmployeeService {

	// 人资系统员工管理模块 对外提供获取员工信息方法
	public String searchEmployees() {
		return "{\"U0001\":\"张三\",\"U0002\":\"李四\",\"U0003\":\"王五\"}";
	}

	// 对外提供获取员工组织信息方法
	public String searchEmployeeOrgans() {
		return "{\"U0001\":\"D001\",\"U0002\":\"D002\",\"U0003\":\"D002\"}";
	}

	// 获取员工详细信息，由于是机密信息只对内部系统提供，不对MyFacade提供。这也是外观模式的一个优点，按照客户端给与不同的调用权限
	public String searchEmployeeInfos() {
		return "{\"U0001\":\"15912345678\",\"U0002\":\"13912345678\",\"U0003\":\"13212345678\"}";
	}
}
