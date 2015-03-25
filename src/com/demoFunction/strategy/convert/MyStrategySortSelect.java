package com.demoFunction.strategy.convert;

import com.demoFunction.strategy.strategy.IMyStrategySort;

/**
 * 策略模式_具体策略类_冒泡法排序
 * 
 * <ul>
 * <li>在未排序序列中找到最小元素，存放到排序序列的起始位置</li>
 * <li>再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。</li>
 * <li>以此类推，直到所有元素均排序完毕。</li>
 * </ul>
 * 
 * @author popkidorc
 * 
 */
public class MyStrategySortSelect implements IMyStrategySort {

	@Override
	public void sort(int[] ints) throws Exception {
		for (int i = 0; i < ints.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < ints.length; j++) {
				if (ints[min] > ints[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = ints[i];
				ints[i] = ints[min];
				ints[min] = temp;
			}
		}
	}

}
