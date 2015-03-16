package com.demoStructure.facade.service;

/**
 * 外观模式_薪水服务类
 * 
 * @author popkidorc
 * 
 */
public class MyFacadeSalaryService {

	// 员工薪资系统 对外提供获取员工薪水方法
	public String searchSalarys() {
		return "{\"U0001\":\"5000.00\",\"U0002\":\"10000.00\",\"U0003\":\"20000.00\"}";
	}
}
