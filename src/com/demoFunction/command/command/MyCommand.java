package com.demoFunction.command.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式_抽象命令
 * 
 * @author popkidorc
 * 
 */
public abstract class MyCommand {

	/**
	 * 存储操作日志
	 */
	protected List<Object> operationList = new ArrayList<Object>();

	/**
	 * 执行
	 */
	public abstract void executeCommand();

	/**
	 * 撤销
	 */
	public abstract void undo();

	/**
	 * 恢复
	 */
	public abstract void redo();

}
