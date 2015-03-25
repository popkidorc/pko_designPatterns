package com.demoFunction.strategy.context;

import com.demoFunction.strategy.strategy.IMyStrategySort;

/**
 * 策略模式_上下文类
 * 
 * @author popkidorc
 * 
 */
public class MyStrategyContext {
	IMyStrategySort myStrategySort;

	public void setMyStrategySort(IMyStrategySort myStrategySort) {
		this.myStrategySort = myStrategySort;
	}

	public void sort(int[] ints) throws Exception {
		if (myStrategySort == null) {
			throw new Exception("myStrategySort为空");
		}
		long startTime = System.currentTimeMillis(); // 获取开始时间
		System.out.println("====sort start===="
				+ myStrategySort.getClass().getName() + "====" + startTime);
		myStrategySort.sort(ints);
		long endTime = System.currentTimeMillis(); // 获取结束时间
		System.out.println("====sort end===="
				+ myStrategySort.getClass().getName() + "====" + endTime
				+ "\n====" + (endTime - startTime) + "ms");
	}
}
