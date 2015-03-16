package com.demoStructure.composite.component;

/**
 * 组合模式_实体抽象类
 * 
 * @author popkidorc
 * 
 */
public abstract class MyComponentAbstractOperation implements
		IMyComponentOperation {

	private String operationName;

	private String operationType;

	private String operationContext;

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOperationContext() {
		return operationContext;
	}

	public void setOperationContext(String operationContext) {
		this.operationContext = operationContext;
	}
}
