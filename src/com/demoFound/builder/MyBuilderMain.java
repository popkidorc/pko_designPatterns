package com.demoFound.builder;

import java.util.HashMap;
import java.util.Map;

import com.demoFound.builder.builder.IMyExceptionBuilder;
import com.demoFound.builder.builder.MyExceptionCheckOutBuilder;
import com.demoFound.builder.builder.MyExceptionFindEntityBuilder;
import com.demoFound.builder.director.MyExceptionDirector;
import com.demoFound.builder.exception.MyAbstractException;

/**
 * 构造模式_消费者类
 * 
 * @author popkidorc
 * 
 */
public class MyBuilderMain {
	// 指挥者初始化，可以考虑用单例
	private static MyExceptionDirector myExceptionDirector = new MyExceptionDirector();

	private static void findEntity(String id) throws MyAbstractException {
		// 模拟的数据集，根据传入id来查询对应数据，map中value值为数据的状态
		Map<String, String> myMap = new HashMap<String, String>() {
			{
				put("ID000001", "checkIn");
				put("ID000002", "checkOut");
			}
		};
		// 如果数据集中没有该数据，抛出找不到实体的异常
		if (!myMap.keySet().contains(id)) {
			// 找一个builder，然后给director，director指挥builder进行产品的生产，消费者完全不关心如何生产，只关心结果
			IMyExceptionBuilder myExceptionBuilder = new MyExceptionFindEntityBuilder();
			myExceptionDirector.buildException(myExceptionBuilder);
			throw myExceptionBuilder.getResult();
		}
		// 如果数据集中有该数据，但该数据是checkout状态，抛出checkout的异常
		if ("checkOut".equals(myMap.get(id))) {
			IMyExceptionBuilder myExceptionBuilder = new MyExceptionCheckOutBuilder();
			myExceptionDirector.buildException(myExceptionBuilder);
			throw myExceptionBuilder.getResult();
		}
		System.out.println("success");
	}

	public static void main(String[] args) {
		try {
			findEntity("ID000003");
		} catch (MyAbstractException e) {
			System.out.println(e.getMessage("CN"));
		}
		try {
			findEntity("ID000002");
		} catch (MyAbstractException e) {
			System.out.println(e.getMessage("US"));
		}
	}

}
