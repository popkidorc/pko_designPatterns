package com.demoFunction.template;

import com.demoFunction.template.template.MyTemplateEngineeringProject;
import com.demoFunction.template.template.MyTemplateProject;
import com.demoFunction.template.template.MyTemplateSoftwareProject;

/**
 * 模板模式_消费者
 * 
 * @author popkidorc
 * 
 */
public class MyTemplateMain {

	public static void main(String[] args) {
		// 工程项目
		MyTemplateProject myTemplateProject = new MyTemplateEngineeringProject();
		myTemplateProject.start();

		// 软件项目
		myTemplateProject = new MyTemplateSoftwareProject();
		myTemplateProject.start();
	}

}
