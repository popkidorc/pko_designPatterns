package com.demoFunction.state.state;

import java.util.Date;

import com.demoFunction.state.context.MyStateProjectContext;

/**
 * 状态模式_状态_运行中
 * 
 * @author popkidorc
 * 
 */
public class MyStateProjectOngoingState extends MyStateProjectState {

	public MyStateProjectOngoingState(
			MyStateProjectContext myStateProjectContext) {
		super(myStateProjectContext);
	}

	@Override
	public void startProject() throws Exception {
		throw new Exception("该项目已开始");
	}

	@Override
	public void pauseProject() throws Exception {
		System.out.println("项目暂停:" + dateFormat.format(new Date()));
		getMyStateProjectContext().changeProjectState(
				getMyStateProjectContext().getMyStateProjectPauseState());
	}

	@Override
	public void redoProject() throws Exception {
		throw new Exception("该项目未暂停");
	}

	@Override
	public void stopProject() throws Exception {
		System.out.println("进行中项目终止，需要公司级审批（这里审批省略，直接改变状态）:"
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
		return "进行中";
	}
}
