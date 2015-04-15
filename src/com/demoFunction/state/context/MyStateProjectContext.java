package com.demoFunction.state.context;

import com.demoFunction.state.state.MyStateProjectEndState;
import com.demoFunction.state.state.MyStateProjectNotStartState;
import com.demoFunction.state.state.MyStateProjectOngoingState;
import com.demoFunction.state.state.MyStateProjectPauseState;
import com.demoFunction.state.state.MyStateProjectState;

/**
 * 状态模式_使用环境
 * 
 * @author popkidorc
 * 
 */
public class MyStateProjectContext {

	private MyStateProjectNotStartState myStateProjectNotStartState;
	private MyStateProjectOngoingState myStateProjectOngoingState;
	private MyStateProjectPauseState myStateProjectPauseState;
	private MyStateProjectEndState myStateProjectEndState;

	// 项目当前状态
	private MyStateProjectState projectState;

	/**
	 * 
	 */
	public MyStateProjectContext() {
		myStateProjectNotStartState = new MyStateProjectNotStartState(this);
		myStateProjectOngoingState = new MyStateProjectOngoingState(this);
		myStateProjectPauseState = new MyStateProjectPauseState(this);
		myStateProjectEndState = new MyStateProjectEndState(this);
		projectState = myStateProjectNotStartState;
	}

	public MyStateProjectNotStartState getMyStateProjectNotStartState() {
		return myStateProjectNotStartState;
	}

	public MyStateProjectOngoingState getMyStateProjectOngoingState() {
		return myStateProjectOngoingState;
	}

	public MyStateProjectPauseState getMyStateProjectPauseState() {
		return myStateProjectPauseState;
	}

	public MyStateProjectEndState getMyStateProjectEndState() {
		return myStateProjectEndState;
	}

	public MyStateProjectState getProjectState() {
		return projectState;
	}

	public void changeProjectState(MyStateProjectState projectState) {
		this.projectState = projectState;
	}

	public void startProject() throws Exception {
		getProjectState().startProject();
	}

	public void pauseProject() throws Exception {
		getProjectState().pauseProject();
	}

	public void redoProject() throws Exception {
		getProjectState().redoProject();
	}

	public void stopProject() throws Exception {
		getProjectState().stopProject();
	}

	public void finishProject() throws Exception {
		getProjectState().finishProject();
	}
}
