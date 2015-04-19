package com.demoFunction.observer.topic;

import com.demoFunction.observer.observer.MyObserverObserver;

/**
 * 观察者模式_具体主题
 * 
 * @author popkidorc
 * 
 */
public class MyObserverConfigTopic extends MyObserverTopic {

	// 发送主题
	@Override
	public void sendMessage() {
		for (MyObserverObserver myObserverObserver : this.myObserverObservers) {
			myObserverObserver.refreshConfig();
		}
	}
}
