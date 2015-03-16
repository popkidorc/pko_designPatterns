package com.demoStructure.flyweight.flyweight;

/**
 * 
 * 享元模式_抽象享元_集合码表类
 * 
 * @author popkidorc
 * 
 */
public class MyFlyweightSimpleCode extends MyFlyweightBaseCode {

	// 普通的码表，用来存放配置信息以及常亮信息.这里只有2个简单的属性，中/英文的描述
	public String codeCNName;

	public String codeUSName;

	public MyFlyweightSimpleCode(String code, String codeDescribe,
			String codeCNName, String codeUSName) {
		this.code = code;
		this.codeDescribe = codeDescribe;
		this.codeCNName = codeCNName;
		this.codeUSName = codeUSName;
	}

	public String getCodeCNName() {
		return codeCNName;
	}

	public void setCodeCNName(String codeCNName) {
		this.codeCNName = codeCNName;
	}

	public String getCodeUSName() {
		return codeUSName;
	}

	public void setCodeUSName(String codeUSName) {
		this.codeUSName = codeUSName;
	}

	@Override
	public void printCodeInfos() {
		System.out
				.println("==the code infos==MyFlyweightSimpleCode [codeCNName="
						+ codeCNName + ", codeUSName=" + codeUSName + ", code="
						+ code + "]");
	}

}