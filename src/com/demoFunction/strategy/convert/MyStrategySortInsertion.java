package com.demoFunction.strategy.convert;

import com.demoFunction.strategy.strategy.IMyStrategySort;

/**
 * 策略模式_具体策略类_直插法排序
 * 
 * <ul>
 * <li>从第一个元素开始，该元素可以认为已经被排序</li>
 * <li>取出下一个元素，在已经排序的元素序列中从后向前扫描</li>
 * <li>如果该元素（已排序）大于新元素，将该元素移到下一位置</li>
 * <li>重复步骤3，直到找到已排序的元素小于或者等于新元素的位置</li>
 * <li>将新元素插入到该位置中</li>
 * <li>重复步骤2</li>
 * </ul>
 * 
 * @author popkidorc
 * 
 */
public class MyStrategySortInsertion implements IMyStrategySort {

	@Override
	public void sort(int[] ints) throws Exception {
		int size = ints.length, temp, j;
		for (int i = 1; i < size; i++) {
			temp = ints[i];
			for (j = i; j > 0 && temp < ints[j - 1]; j--)
				ints[j] = ints[j - 1];
			ints[j] = temp;
		}
	}

}
