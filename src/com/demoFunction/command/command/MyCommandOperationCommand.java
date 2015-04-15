package com.demoFunction.command.command;

import com.demoFunction.command.receiver.MyCommandSaveReceiver;

/**
 * 命令模式_具体命令
 * 
 * @author popkidorc
 * 
 */
public class MyCommandOperationCommand extends MyCommand {

	protected MyCommandSaveReceiver myCommandSaveReceiver;

	/**
	 * @param myCommandSaveReceiver
	 */
	public MyCommandOperationCommand(MyCommandSaveReceiver myCommandSaveReceiver) {
		this.myCommandSaveReceiver = myCommandSaveReceiver;
	}

	@Override
	public void executeCommand() {
		if (this.myCommandSaveReceiver == null) {
			System.out.println("receiver is null");
			return;
		}
		this.myCommandSaveReceiver.count();
		// TODO 这里应该将操作加入日志
	}

	@Override
	public void undo() {
		// TODO
	}

	@Override
	public void redo() {
		// TODO
	}

}
