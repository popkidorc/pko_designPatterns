package com.demoFunction.template.template;

/**
 * 模板模式_具体实现_工程项目
 * 
 * @author popkidorc
 * 
 */
public class MyTemplateEngineeringProject extends MyTemplateProject {

	@Override
	protected void survey() {
		System.out.println("工程项目调研");
	}

	@Override
	protected void exploration() {
		System.out.println("工程项目需要现场勘查");
	}

	@Override
	protected void plan() {
		System.out.println("指定工程项目计划");
	}

}
