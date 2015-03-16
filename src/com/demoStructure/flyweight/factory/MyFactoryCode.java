package com.demoStructure.flyweight.factory;

import java.util.HashMap;

import com.demoStructure.flyweight.flyweight.MyFlyweightBaseCode;
import com.demoStructure.flyweight.flyweight.MyFlyweightSimpleCode;

/**
 * 
 * 享元模式_享元工厂_码表缓存类
 * 
 * @author popkidorc
 * 
 */
public class MyFactoryCode {

	// 模拟一个享元池，一般系统的业务缓存都是享元模式的思路
	private static HashMap<String, MyFlyweightBaseCode> myFlyweighMap = new HashMap<String, MyFlyweightBaseCode>();

	/**
	 * 根据父码表编码获取对应码表对象
	 * 
	 * @param prarentCode
	 * @return
	 */
	public static MyFlyweightBaseCode getMyFlyweightBaseCode(String prarentCode) {
		MyFlyweightBaseCode myFlyweightBaseCode = myFlyweighMap
				.get(prarentCode);
		// 如果缓存中有则直接返回；没有则获取实时数据将其添加至缓存后，再返回
		if (myFlyweightBaseCode != null) {
			System.out.println("==从池中获取==");
			return myFlyweightBaseCode;
		} else {
			// 一般来说这里是根据数据库或者配置表获得实时数据，这里模拟一条.
			System.out.println("==直接创建==");
			myFlyweightBaseCode = new MyFlyweightSimpleCode("PS0101", "项目类型",
					"工程项目", "engineering project");
			myFlyweighMap.put(prarentCode, myFlyweightBaseCode);
			return myFlyweightBaseCode;
		}
	}
}
