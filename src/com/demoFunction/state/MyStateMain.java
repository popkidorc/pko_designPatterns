package com.demoFunction.state;

import com.demoFunction.state.context.MyStateProjectContext;

/**
 * 状态模式_消费者
 * 
 * @author popkidorc
 * 
 */
public class MyStateMain {

	public static void main(String[] args) {
		try {
			// 建立一个项目
			MyStateProjectContext myStateProjectContext = new MyStateProjectContext();
			System.out.println("==project state=="
					+ myStateProjectContext.getProjectState().getStateName());
			// 项目行为，这里可以尝试各种行为，会根据项目的不同状态进行不同的操作
			myStateProjectContext.startProject();
			System.out.println("==project state=="
					+ myStateProjectContext.getProjectState().getStateName());
			myStateProjectContext.pauseProject();
			System.out.println("==project state=="
					+ myStateProjectContext.getProjectState().getStateName());
			myStateProjectContext.redoProject();
			System.out.println("==project state=="
					+ myStateProjectContext.getProjectState().getStateName());
			myStateProjectContext.finishProject();
			System.out.println("==project state=="
					+ myStateProjectContext.getProjectState().getStateName());
			myStateProjectContext.startProject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
