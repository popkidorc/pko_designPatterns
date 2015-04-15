package com.demoFunction.state.state;

import com.demoFunction.state.context.MyStateProjectContext;

/**
 * 状态模式_状态_未开始
 * 
 * @author popkidorc
 * 
 */
public class MyStateProjectNotStartState extends MyStateProjectState {

	public MyStateProjectNotStartState(
			MyStateProjectContext myStateProjectContext) {
		super(myStateProjectContext);
	}

	@Override
	public void startProject() throws Exception {
		System.out.println("项目开始");
		getMyStateProjectContext().changeProjectState(
				getMyStateProjectContext().getMyStateProjectOngoingState());
	}

	@Override
	public void pauseProject() throws Exception {
		throw new Exception("未开始项目不能暂停");
	}

	@Override
	public void redoProject() throws Exception {
		throw new Exception("未开始项目不能恢复");
	}

	@Override
	public void stopProject() throws Exception {
		throw new Exception("未开始项目不能终止");
	}

	@Override
	public void finishProject() throws Exception {
		throw new Exception("未开始项目不能完成");
	}

	@Override
	public String getStateName() {
		return "未开始";
	}
}
