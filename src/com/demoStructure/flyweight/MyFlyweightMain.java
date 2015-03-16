package com.demoStructure.flyweight;

import com.demoStructure.flyweight.factory.MyFactoryCode;
import com.demoStructure.flyweight.flyweight.MyFlyweightBaseCode;
import com.demoStructure.flyweight.flyweight.MyFlyweightSimpleCode;

/**
 * 
 * 享元模式_消费者类
 * 
 * @author popkidorc
 * 
 */
public class MyFlyweightMain {

	public static void main(String[] args) {
		// 第一次没有放入缓存，会直接创建，并放入缓存池中
		MyFlyweightBaseCode myFlyweightBaseCode = MyFactoryCode
				.getMyFlyweightBaseCode("PS01");
		myFlyweightBaseCode.printCodeInfos();

		// 第二次从池中获取
		MyFlyweightBaseCode myFlyweightBaseCodeOther = MyFactoryCode
				.getMyFlyweightBaseCode("PS01");
		myFlyweightBaseCodeOther.printCodeInfos();

		/*
		 * 比较比较两个对象是否同一个引用
		 * 
		 * "=="对于基本类型来说比较对象的值，对于非基本类型（包括基本类型的封装类）比较两个对象的对象号（并不是简单的比较内存地址，但也可以理解为地址比较
		 * ，因为引用同一个对象对象号不会变） ）
		 * "equals"是Object的方法,不重写的话与"=="等价，一般都会重写，例如String（首先比较"==",若不等则比较值）
		 */
		System.out.println("共用一个对象："
				+ (myFlyweightBaseCode == myFlyweightBaseCodeOther));

		MyFlyweightBaseCode a1 = new MyFlyweightSimpleCode("PS0101", "项目类型",
				"工程项目", "engineering project");
		MyFlyweightBaseCode a2 = new MyFlyweightSimpleCode("PS0101", "项目类型",
				"工程项目", "engineering project");
		Integer i1 = new Integer(2);
		Integer i2 = new Integer(2);
		System.out.println("==" + a1.equals(a2) + "==" + (a1 == a2));
		System.out.println("==" + i1.equals(i2) + "==" + (i1 == i2));
	}

}
