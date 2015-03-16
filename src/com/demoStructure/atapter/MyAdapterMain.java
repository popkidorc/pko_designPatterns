package com.demoStructure.atapter;

import com.demoStructure.atapter.adapter.MyAdapterGenerateUUID;
import com.demoStructure.atapter.target.IMyTargetGenerateUUID;

/**
 * 适配器模式_消费者
 * 
 * @author popkidorc
 * 
 */
public class MyAdapterMain {

	private static IMyTargetGenerateUUID myTargetGenerateUUID;

	private static void init() {
		// 原来用MyTargetGenerateUUID，现在使用MyAdapterGenerateUUID适配器
		// myTargetGenerateUUID = new MyTargetGenerateUUID();
		myTargetGenerateUUID = new MyAdapterGenerateUUID();
	}

	public static void main(String[] args) {
		init();
		String uuid = myTargetGenerateUUID.generateUUID();
		System.out.println("==uuid==" + uuid);
	}

}
