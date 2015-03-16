package com.demoFound.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/**
 * 原型模式_原型类
 * 
 * @author popkidorc
 * 
 */
public class MyPrototypeProcessInstance implements Serializable, Cloneable {
	// 只有实现了Clonealbe接口，虚拟机才会认为clone是可用的，不然会抛出CloneNotSupportedException
	// 实现Serializable是为了可以进行流化clone，该clone为深clone
	private static final long serialVersionUID = 1L;

	private String processInstanceId;

	private String processTitle;

	private String processDefinitionId;

	private String processStatus;

	private List<MyPrototypeTaskInstance> taskInstances;

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessTitle() {
		return processTitle;
	}

	public void setProcessTitle(String processTitle) {
		this.processTitle = processTitle;
	}

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public List<MyPrototypeTaskInstance> getTaskInstances() {
		return taskInstances;
	}

	public void setTaskInstances(List<MyPrototypeTaskInstance> taskInstances) {
		this.taskInstances = taskInstances;
	}

	@Override
	public MyPrototypeProcessInstance clone() throws CloneNotSupportedException {
		// 浅clone，对taskInstances来说仍然是引用，2个对象使用一个taskInstances.只有8个基本类型和其封装类以及String是深clone，其他均为浅clone
		// return (MyPrototypeProcessInstance) super.clone();

		// 深clone，传统方式
		// MyPrototypeProcessInstance myPrototypeProcessInstanceClone =
		// (MyPrototypeProcessInstance) super
		// .clone();
		// // 非8基本类型或者String，需要通过new，然后为其copy值的方式来clone
		// List<MyPrototypeTaskInstance> myPrototypeTaskInstancesClone = new
		// ArrayList<MyPrototypeTaskInstance>();
		// for (MyPrototypeTaskInstance myPrototypeTaskInstance : this
		// .getTaskInstances()) {
		// myPrototypeTaskInstancesClone.add(myPrototypeTaskInstance.clone());
		// }
		// myPrototypeProcessInstanceClone
		// .setTaskInstances(myPrototypeTaskInstancesClone);
		// return myPrototypeProcessInstanceClone;

		// 深clone，流化方式，需要实现Serializable
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream;
		try {
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			// 写入流
			objectOutputStream.writeObject(this);

			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
					byteArrayOutputStream.toByteArray());
			ObjectInputStream objectInputStream = new ObjectInputStream(
					byteArrayInputStream);
			// 读出流
			return (MyPrototypeProcessInstance) objectInputStream.readObject();
		} catch (IOException e) {
			System.out.println("==IOException==");
		} catch (ClassNotFoundException e) {
			System.out.println("==ClassNotFoundException==");
		}
		return null;
	}
}
