package com.demoStructure.flyweight.flyweight;

/**
 * 
 * 享元模式_抽象享元_码表基类
 * 
 * @author popkidorc
 * 
 */
public abstract class MyFlyweightBaseCode {
	// 码表的编码，任何类型的码表数据均应该有该属性，故作为抽象类的属性
	protected String code;
	protected String codeDescribe;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeDescribe() {
		return codeDescribe;
	}

	public void setCodeDescribe(String codeDescribe) {
		this.codeDescribe = codeDescribe;
	}

	// 打印码表信息
	public abstract void printCodeInfos();

}