package com.demoStructure.facade.facade;

import com.demoStructure.facade.service.MyFacadeDepartmentService;
import com.demoStructure.facade.service.MyFacadeEmployeeService;
import com.demoStructure.facade.service.MyFacadeSalaryService;

/**
 * 外观模式_外观类
 * 
 * @author popkidorc
 * 
 */
public class MyFacade {
	// 这里可以使用构造类模式进行构造，例如工厂模式，将这些service作为产品，使MyFacade和这些service没有耦合关系
	private MyFacadeDepartmentService myFacadeDepartmentService = new MyFacadeDepartmentService();
	private MyFacadeEmployeeService myFacadeEmployeeService = new MyFacadeEmployeeService();
	private MyFacadeSalaryService myFacadeSalaryService = new MyFacadeSalaryService();

	// 这里没有MyFacadeEmployeeService的searchEmployeeInfos方法，即该方法不对外提供
	// 这里的方法当然可以组合调用，用来分发、路由等等，这里为了简洁，不做这些复杂的东西
	public String searchDepartments() {
		return myFacadeDepartmentService.searchDepartments();
	}

	public String searchEmployees() {
		return myFacadeEmployeeService.searchEmployees();
	}

	public String searchEmployeeOrgans() {
		return myFacadeEmployeeService.searchEmployeeOrgans();
	}

	public String searchSalarys() {
		return myFacadeSalaryService.searchSalarys();
	}
}
