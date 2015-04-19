package com.demoFunction.observer.observer;

/**
 * 观察者模式_具体观察者
 * 
 * @author popkidorc
 * 
 */
public abstract class MyObserverObserver {

	protected String companyName;

	public MyObserverObserver(String companyName) {
		super();
		this.companyName = companyName;
	}

	public abstract void refreshConfig();

}
