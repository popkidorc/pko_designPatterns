package com.demoFunction.state.state;

import com.demoFunction.state.context.MyStateProjectContext;

/**
 * 状态模式_状态_已结束
 * 
 * @author popkidorc
 * 
 */
public class MyStateProjectEndState extends MyStateProjectState {

	public MyStateProjectEndState(MyStateProjectContext myStateProjectContext) {
		super(myStateProjectContext);
	}

	@Override
	public void startProject() throws Exception {
		throw new Exception("该项目已结束，不能操作");
	}

	@Override
	public void pauseProject() throws Exception {
		throw new Exception("该项目已结束，不能操作");
	}

	@Override
	public void redoProject() throws Exception {
		throw new Exception("该项目已结束，不能操作");
	}

	@Override
	public void stopProject() throws Exception {
		throw new Exception("该项目已结束，不能操作");
	}

	@Override
	public void finishProject() throws Exception {
		throw new Exception("该项目已结束，不能操作");
	}

	@Override
	public String getStateName() {
		return "已结束";
	}
}
