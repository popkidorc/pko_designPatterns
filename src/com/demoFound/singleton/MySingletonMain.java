package com.demoFound.singleton;

/**
 * 单例模式_消费者类
 * 
 * @author popkidorc
 * 
 */
public class MySingletonMain {

	public static void main(String[] args) {
		System.out.println("1." + MySingleton.getInstance());
		System.out.println("2." + MySingleton.getInstance());
		System.out.println("3." + MySingleton.getInstance());// 均是同一个对象，在同一个内存中
	}
}
