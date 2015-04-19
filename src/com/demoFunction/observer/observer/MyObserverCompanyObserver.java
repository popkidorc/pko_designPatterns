package com.demoFunction.observer.observer;

/**
 * 观察者模式_抽象观察者
 * 
 * @author popkidorc
 * 
 */
public class MyObserverCompanyObserver extends MyObserverObserver {

	public MyObserverCompanyObserver(String companyName) {
		super(companyName);
	}

	@Override
	public void refreshConfig() {
		System.out.println("刷新'" + this.companyName + "'公司的配置");
	}
}
