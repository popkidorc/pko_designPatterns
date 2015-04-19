package com.demoFunction.chain.handler;

/**
 * 责任链模式_抽象处理者
 * 
 * @author popkidorc
 * 
 */
public abstract class MyChainHandler {

	// 后续继承者
	protected MyChainHandler successor;

	public MyChainHandler getSuccessor() {
		return successor;
	}

	public void setSuccessor(MyChainHandler successor) {
		this.successor = successor;
	}

	// 处理请求的方法，传入操作url,按照角色租、单个角色、操作来判断该url是否有该权限。
	public abstract String handleRequest(String operationUrl);

}
