package com.demoFound.builder.exception;

/**
 * 构造模式_产品接口
 * 
 * @author popkidorc
 * 
 */
public interface IMyException {

	public String getExceptionCode();

	public void setExceptionCode(String exceptionCode);

	public String getExceptionMessageCN();

	public void setExceptionMessageCN(String exceptionMessageCN);

	public String getExceptionMessageUS();

	public void setExceptionMessageUS(String exceptionMessageUS);

	public String getMessage(String language);
}
