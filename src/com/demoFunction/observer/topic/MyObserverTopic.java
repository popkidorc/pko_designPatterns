package com.demoFunction.observer.topic;

import java.util.ArrayList;
import java.util.List;

import com.demoFunction.observer.observer.MyObserverObserver;

/**
 * 观察者模式_抽象主题
 * 
 * @author popkidorc
 * 
 */
public abstract class MyObserverTopic {

	public List<MyObserverObserver> myObserverObservers;

	public MyObserverTopic() {
		super();
		this.myObserverObservers = new ArrayList<MyObserverObserver>();
	}

	// 添加观察者
	public void addObserver(MyObserverObserver myObserverObserver) {
		this.myObserverObservers.add(myObserverObserver);
	}

	// 移除观察者
	public void removeObserver(MyObserverObserver myObserverObserver) {
		this.myObserverObservers.remove(myObserverObserver);
	}

	// 发送主题
	public abstract void sendMessage();
}
