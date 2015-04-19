package com.demoFunction.observer;

import com.demoFunction.observer.observer.MyObserverCompanyObserver;
import com.demoFunction.observer.observer.MyObserverObserver;
import com.demoFunction.observer.topic.MyObserverConfigTopic;
import com.demoFunction.observer.topic.MyObserverTopic;
import com.demoFunction.state.context.MyStateProjectContext;

/**
 * 观察者模式_消费者
 * 
 * @author popkidorc
 * 
 */
public class MyObserverMain {

	public static void main(String[] args) {
		try {
			// 建立一个主题
			MyObserverTopic myObserverTopic = new MyObserverConfigTopic();
			myObserverTopic.addObserver(new MyObserverCompanyObserver("公司A"));
			myObserverTopic.addObserver(new MyObserverCompanyObserver("公司B"));
			myObserverTopic.addObserver(new MyObserverCompanyObserver("公司C"));

			// 发送
			myObserverTopic.sendMessage();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
