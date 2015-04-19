package com.demoFunction.chain;

import com.demoFunction.chain.handler.MyChainGroupHandler;
import com.demoFunction.chain.handler.MyChainHandler;
import com.demoFunction.chain.handler.MyChainOperationHandler;
import com.demoFunction.chain.handler.MyChainRoleHandler;

/**
 * 责任链模式_消费者
 * 
 * @author popkidorc
 * 
 */
class MyChainMain {

	// 这里是一个纯处理链，也可以增加一个list来管理处理者，但这样理论上来说有可能不是纯处理连（某个处理者处理了一部分，然后推送到下家处理剩下部分）
	public static void main(String[] args) {
		// 组装责任链
		MyChainHandler myChainGroupHandler = new MyChainGroupHandler();
		MyChainHandler myChainRoleHandler = new MyChainRoleHandler();
		myChainGroupHandler.setSuccessor(myChainRoleHandler);
		MyChainHandler myChainOperationHandler = new MyChainOperationHandler();
		myChainRoleHandler.setSuccessor(myChainOperationHandler);
		// 进行处理调用
		String result = myChainGroupHandler.handleRequest("url1");
		System.out.println(result);
		result = myChainGroupHandler.handleRequest("url3");
		System.out.println(result);
		result = myChainGroupHandler.handleRequest("url5");
		System.out.println(result);
		result = myChainGroupHandler.handleRequest("url6");
		System.out.println(result);
		result = myChainGroupHandler.handleRequest("url7");
		System.out.println(result);
	}
}
