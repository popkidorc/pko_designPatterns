package com.demoFunction.state.state;

import java.util.Date;

import com.demoFunction.state.context.MyStateProjectContext;

/**
 * 状态模式_状态_已暂停
 * 
 * @author popkidorc
 * 
 */
public class MyStateProjectPauseState extends MyStateProjectState {

	public MyStateProjectPauseState(MyStateProjectContext myStateProjectContext) {
		super(myStateProjectContext);
	}

	@Override
	public void startProject() throws Exception {
		throw new Exception("该项目已开始");
	}

	@Override
	public void pauseProject() throws Exception {
		throw new Exception("该项目已暂停");
	}

	@Override
	public void redoProject() throws Exception {
		System.out.println("项目恢复至进行中:" + dateFormat.format(new Date()));
		getMyStateProjectContext().changeProjectState(
				getMyStateProjectContext().getMyStateProjectOngoingState());
	}

	@Override
	public void stopProject() throws Exception {
		System.out.println("暂停中项目终止，需要部门级审批（这里审批省略，直接改变状态）:"
				+ dateFormat.format(new Date()));
		getMyStateProjectContext().changeProjectState(
				getMyStateProjectContext().getMyStateProjectEndState());
	}

	@Override
	public void finishProject() throws Exception {
		System.out.println("项目完成:" + dateFormat.format(new Date()));
		getMyStateProjectContext().changeProjectState(
				getMyStateProjectContext().getMyStateProjectEndState());
	}

	@Override
	public String getStateName() {
		return "已暂停";
	}

}
