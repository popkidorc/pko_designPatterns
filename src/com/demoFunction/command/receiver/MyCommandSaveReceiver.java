package com.demoFunction.command.receiver;

/**
 * 命令模式_具体执行者
 * 
 * @author popkidorc
 * 
 */
public class MyCommandSaveReceiver {

	private int count = 0;

	public void count() {
		count++;
		System.out.println("==count==" + count);
	}

}
