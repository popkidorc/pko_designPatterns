package com.demoFunction.chain.handler;

import java.util.HashSet;
import java.util.Set;

/**
 * 责任链模式_抽象处理者
 * 
 * @author popkidorc
 * 
 */
public class MyChainOperationHandler extends MyChainHandler {

	// 该属性不是责任链中的必要属性，仅作为业务处理的使用
	private static Set<String> operationList = new HashSet<String>() {
		{
			add("url3");
			add("url6");
			add("url7");
		}
	};

	@Override
	public String handleRequest(String operationUrl) {
		String result = null;
		if (operationList.contains(operationUrl)) {
			result = "拥有该权限（操作判断）";
		} else {
			if (getSuccessor() != null) {
				return getSuccessor().handleRequest(operationUrl);
			}
		}
		return result;
	}

}
