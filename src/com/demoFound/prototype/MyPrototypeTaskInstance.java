package com.demoFound.prototype;

import java.io.Serializable;

/**
 * 原型模式_原型类的子类
 * 
 * @author popkidorc
 * 
 */
public class MyPrototypeTaskInstance implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private String taskInstanceId;

	private String taskInstanceUser;

	public String getTaskInstanceId() {
		return taskInstanceId;
	}

	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	public String getTaskInstanceUser() {
		return taskInstanceUser;
	}

	public void setTaskInstanceUser(String taskInstanceUser) {
		this.taskInstanceUser = taskInstanceUser;
	}

	@Override
	public MyPrototypeTaskInstance clone() throws CloneNotSupportedException {
		return (MyPrototypeTaskInstance) super.clone();
	}
}
