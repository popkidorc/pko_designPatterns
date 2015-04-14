package com.demoFunction.command.invoker;

import com.demoFunction.command.command.IMyCommand;

/**
 * 命令模式_请求者
 * 
 * @author popkidorc
 * 
 */
public class MyCommandInvoker {
	private IMyCommand myCommandCommand;

	public void setMyCommandCommand(IMyCommand myCommandCommand) {
		this.myCommandCommand = myCommandCommand;
	}

	public void executeCommand() {
		myCommandCommand.executeCommand();
	}
}
