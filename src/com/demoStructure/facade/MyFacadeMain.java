package com.demoStructure.facade;

import com.demoStructure.facade.client.MyFacadeCostClient;
import com.demoStructure.facade.client.MyFacadeProtalClient;

/**
 * 外观模式_消费者类
 * 
 * @author popkidorc
 * 
 */
public class MyFacadeMain {
	// 该类仅仅作为测试，实际的消费者应该是两个client
	public static void main(String[] args) {
		MyFacadeCostClient myFacadeCostClient = new MyFacadeCostClient();
		myFacadeCostClient.getEmployeeCost();

		MyFacadeProtalClient myFacadeProtalClient = new MyFacadeProtalClient();
		myFacadeProtalClient.getEmployeeOrgans();
	}
}
