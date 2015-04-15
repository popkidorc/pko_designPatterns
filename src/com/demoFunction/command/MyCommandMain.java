package com.demoFunction.command;

import com.demoFunction.command.command.MyCommand;
import com.demoFunction.command.command.MyCommandOperationCommand;
import com.demoFunction.command.invoker.MyCommandInvoker;
import com.demoFunction.command.receiver.MyCommandSaveReceiver;

/**
 * 命令模式_消费者
 * 
 * @author popkidorc
 * 
 */
public class MyCommandMain {

	public static void main(String[] args) {
		// 为命令指定执行者
		MyCommandSaveReceiver myCommandSaveReceiver = new MyCommandSaveReceiver();
		MyCommand myCommand = new MyCommandOperationCommand(
				myCommandSaveReceiver);

		// 命令的请求者，当请求执行命令后，将于请求者无关。
		MyCommandInvoker myCommandInvoker = new MyCommandInvoker();
		myCommandInvoker.setMyCommandCommand(myCommand);
		myCommandInvoker.executeCommand();
	}
}
