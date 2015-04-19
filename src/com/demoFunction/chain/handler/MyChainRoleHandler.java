package com.demoFunction.chain.handler;

import java.util.HashSet;
import java.util.Set;

/**
 * 责任链模式_抽象处理者
 * 
 * @author popkidorc
 * 
 */
public class MyChainRoleHandler extends MyChainHandler {

	// 该属性不是责任链中的必要属性，仅作为业务处理的使用
	private static Set<String> roleList = new HashSet<String>() {
		{
			add("url2");
			add("url3");
			add("url4");
			add("url5");
			add("url6");
		}
	};

	@Override
	public String handleRequest(String operationUrl) {
		String result = null;
		if (roleList.contains(operationUrl)) {
			result = "拥有该权限（角色判断）";
		} else {
			if (getSuccessor() != null) {
				return getSuccessor().handleRequest(operationUrl);
			}
		}
		return result;
	}
}
