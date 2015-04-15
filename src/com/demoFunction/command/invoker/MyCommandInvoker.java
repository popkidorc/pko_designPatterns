package com.demoFunction.command.invoker;

import com.demoFunction.command.command.MyCommand;

/**
 * 命令模式_请求者
 * 
 * @author popkidorc
 * 
 */
public class MyCommandInvoker {
	private MyCommand myCommandCommand;

	public void setMyCommandCommand(MyCommand myCommandCommand) {
		this.myCommandCommand = myCommandCommand;
	}

	public void executeCommand() {
		myCommandCommand.executeCommand();
	}
}
