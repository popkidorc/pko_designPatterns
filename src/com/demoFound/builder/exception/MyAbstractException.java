package com.demoFound.builder.exception;

/**
 * 构造模式_虚拟产品类
 * 
 * @author popkidorc
 * 
 */
public abstract class MyAbstractException extends Exception implements
		IMyException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String exceptionCode;
	private String exceptionMessageCN;
	private String exceptionMessageUS;

	@Override
	public String getExceptionCode() {
		return exceptionCode;
	}

	@Override
	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	@Override
	public String getExceptionMessageCN() {
		return exceptionMessageCN;
	}

	@Override
	public void setExceptionMessageCN(String exceptionMessageCN) {
		this.exceptionMessageCN = exceptionMessageCN;
	}

	@Override
	public String getExceptionMessageUS() {
		return exceptionMessageUS;
	}

	@Override
	public void setExceptionMessageUS(String exceptionMessageUS) {
		this.exceptionMessageUS = exceptionMessageUS;
	}

	@Override
	public abstract String getMessage(String language);
}
