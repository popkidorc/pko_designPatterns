package com.demoFound.builder.exception;

/**
 * 构造模式_获取实体异常
 * 
 * @author popkidorc
 * 
 */
public class MyExceptionSimple extends MyAbstractException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage(String language) {
		String message = "errorCode : " + getExceptionCode();
		if ("CN".equals(language)) {
			message += ", message : " + getExceptionMessageCN();
		} else if ("US".equals(language)) {
			message += ", message : " + getExceptionMessageUS();
		} else {
			message = "系统不支持 " + language + " 语言";
		}
		return message;
	}
}
