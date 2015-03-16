package com.demoFound.prototype;

import java.util.ArrayList;

/**
 * 原型模式_消费者类
 * 
 * @author popkidorc
 * 
 */
public class MyPrototypeMain {

	private static MyPrototypeProcessInstance myPrototypeProcessInstance;

	private static void initMyPrototypeProcessInstance() {
		// 构造一个MyPrototypeProcessInstance，并为其赋值
		myPrototypeProcessInstance = new MyPrototypeProcessInstance();
		myPrototypeProcessInstance.setProcessDefinitionId("PROC001");
		myPrototypeProcessInstance.setProcessInstanceId("PROCINST00001");
		myPrototypeProcessInstance.setProcessStatus("S0102");
		myPrototypeProcessInstance.setProcessTitle("流程实例测试");
		ArrayList<MyPrototypeTaskInstance> taskInstances = new ArrayList<MyPrototypeTaskInstance>();
		MyPrototypeTaskInstance myPrototypeTaskInstance1 = new MyPrototypeTaskInstance();
		myPrototypeTaskInstance1.setTaskInstanceId("TASK00001");
		myPrototypeTaskInstance1.setTaskInstanceUser("testUser001");
		taskInstances.add(myPrototypeTaskInstance1);
		// 这里就不用clone了，直接new
		MyPrototypeTaskInstance myPrototypeTaskInstance2 = new MyPrototypeTaskInstance();
		myPrototypeTaskInstance2.setTaskInstanceId("TASK00002");
		myPrototypeTaskInstance2.setTaskInstanceUser("testUser002");
		taskInstances.add(myPrototypeTaskInstance2);
		myPrototypeProcessInstance.setTaskInstances(taskInstances);
	}

	public static void main(String[] args) {
		initMyPrototypeProcessInstance();

		// 开始clone
		MyPrototypeProcessInstance myPrototypeProcessInstanceClone = null;
		try {
			myPrototypeProcessInstanceClone = myPrototypeProcessInstance
					.clone();
			// 只有实例id、状态和task的user变化
			myPrototypeProcessInstanceClone
					.setProcessInstanceId("PROCINST00002");
			myPrototypeProcessInstanceClone.setProcessStatus("S0101");
			myPrototypeProcessInstanceClone.getTaskInstances().get(0)
					.setTaskInstanceUser("testUser003");
			myPrototypeProcessInstanceClone.getTaskInstances().get(1)
					.setTaskInstanceUser("testUser004");
		} catch (CloneNotSupportedException e) {
			System.out.println("CloneNotSupportedException");
		}
		// 比对结果
		System.out.println("==myPrototypeProcessInstance=="
				+ myPrototypeProcessInstance.getProcessInstanceId());
		for (MyPrototypeTaskInstance myPrototypeTaskInstance : myPrototypeProcessInstance
				.getTaskInstances()) {
			System.out.println("==myPrototypeProcessInstance=="
					+ myPrototypeTaskInstance.getTaskInstanceUser());
		}

		System.out.println("==myPrototypeProcessInstanceClone=="
				+ myPrototypeProcessInstanceClone.getProcessInstanceId());
		// 若是浅clone可以看到taskInstances为一个内存，只是2个对象均引用了taskInstances；若是深clone，则会为2个对象的taskInstances分别分配内存
		for (MyPrototypeTaskInstance myPrototypeTaskInstance : myPrototypeProcessInstanceClone
				.getTaskInstances()) {
			System.out.println("==myPrototypeProcessInstanceClone=="
					+ myPrototypeTaskInstance.getTaskInstanceUser());
		}
	}
}
