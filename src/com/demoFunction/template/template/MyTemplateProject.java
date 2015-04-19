package com.demoFunction.template.template;

/**
 * 模板模式_模板类
 * 
 * @author popkidorc
 * 
 */
public abstract class MyTemplateProject {

	// 项目调研
	protected abstract void survey();

	// 现场勘查
	protected void exploration() {
	}

	// 项目计划
	protected abstract void plan();

	// 改变状态
	protected void changeStateStart() {
		System.out.println("改变状态为：启动");
	}

	public void start() {
		survey();
		exploration();
		plan();
		changeStateStart();
	}
}
