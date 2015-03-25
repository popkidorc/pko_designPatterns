package com.demoFunction.strategy.convert;

import com.demoFunction.strategy.strategy.IMyStrategySort;

/**
 * 策略模式_具体策略类_冒泡法排序
 * 
 * <ul>
 * <li>比较相邻的元素。如果第一个比第二个大，就交换他们两个。</li>
 * <li>对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。</li>
 * <li>针对所有的元素重复以上的步骤，除了最后一个。</li>
 * <li>持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。</li>
 * </ul>
 * 
 * @author popkidorc
 * 
 */
public class MyStrategySortBubble implements IMyStrategySort {

	@Override
	public void sort(int[] ints) throws Exception {
		int temp; // 记录临时中间值
		int size = ints.length; // 数组大小
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (ints[i] > ints[j]) { // 交换两数的位置
					temp = ints[i];
					ints[i] = ints[j];
					ints[j] = temp;
				}
			}
		}
	}

}
