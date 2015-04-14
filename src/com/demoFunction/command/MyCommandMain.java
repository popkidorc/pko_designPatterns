package com.demoFunction.command;

import com.demoFunction.command.command.IMyCommand;
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
		MyCommandSaveReceiver myCommandSaveReceiver = new MyCommandSaveReceiver();
		IMyCommand myCommand = new MyCommandOperationCommand(
				myCommandSaveReceiver);
		MyCommandInvoker myCommandInvoker = new MyCommandInvoker();
		myCommandInvoker.setMyCommandCommand(myCommand);
		myCommandInvoker.executeCommand();
	}
}
