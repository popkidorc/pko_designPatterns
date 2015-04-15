package com.demoFunction.state.state;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.demoFunction.state.context.MyStateProjectContext;

/**
 * 状态模式_抽象状态
 * 
 * @author popkidorc
 * 
 */
public abstract class MyStateProjectState {

	protected DateFormat dateFormat = new SimpleDateFormat(
			"yyyy-MM-dd hh:mm:ss");

	private MyStateProjectContext myStateProjectContext;

	/**
	 * @param myStateProjectContext
	 */
	public MyStateProjectState(MyStateProjectContext myStateProjectContext) {
		this.myStateProjectContext = myStateProjectContext;
	}

	public MyStateProjectContext getMyStateProjectContext() {
		return myStateProjectContext;
	}

	/**
	 * 项目启动
	 */
	public abstract void startProject() throws Exception;

	/**
	 * 项目暂停
	 */
	public abstract void pauseProject() throws Exception;

	/**
	 * 项目恢复
	 */
	public abstract void redoProject() throws Exception;

	/**
	 * 项目终止
	 */
	public abstract void stopProject() throws Exception;

	/**
	 * 项目结束
	 */
	public abstract void finishProject() throws Exception;

	/**
	 * 返回状态名称，该方法不是状态模式的主要方法
	 * 
	 * @return
	 */
	public abstract String getStateName();
}
