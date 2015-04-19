package com.demoFunction.chain.handler;

import java.util.HashSet;
import java.util.Set;

/**
 * 责任链模式_处理者_组处理
 * 
 * @author popkidorc
 * 
 */
public class MyChainGroupHandler extends MyChainHandler {

	// 该属性不是责任链中的必要属性，仅作为业务处理的使用
	private static Set<String> gourpList = new HashSet<String>() {
		{
			add("url1");
			add("url2");
			add("url3");
		}
	};

	@Override
	public String handleRequest(String operationUrl) {
		String result = null;
		if (gourpList.contains(operationUrl)) {
			result = "拥有该权限（组判断）";
		} else {
			if (getSuccessor() != null) {
				return getSuccessor().handleRequest(operationUrl);
			}
		}
		return result;
	}
}
