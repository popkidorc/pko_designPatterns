package com.demoFunction.template.template;

/**
 * 模板模式_具体实现_软件项目
 * 
 * @author popkidorc
 * 
 */
public class MyTemplateSoftwareProject extends MyTemplateProject {

	@Override
	protected void survey() {
		System.out.println("软件项目调研");
	}

	@Override
	protected void plan() {
		System.out.println("指定软件项目计划");
	}

}
