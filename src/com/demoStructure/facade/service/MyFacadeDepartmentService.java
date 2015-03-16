package com.demoStructure.facade.service;

/**
 * 外观模式_部门信息服务类
 * 
 * @author popkidorc
 * 
 */
public class MyFacadeDepartmentService {

	// 人资系统部门管理模块 对外提供获取部门信息方法
	public String searchDepartments() {
		return "{\"D001\":\"总经理办公室\",\"D002\":\"财务部\"}";
	}
}
