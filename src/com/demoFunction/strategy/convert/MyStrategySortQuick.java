package com.demoFunction.strategy.convert;

import com.demoFunction.strategy.strategy.IMyStrategySort;

/**
 * 策略模式_具体策略类_快速排序
 * 
 * <ul>
 * <li>从数列中挑出一个元素，称为“基准”</li>
 * <li>重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分割之后，
 * 该基准是它的最后位置。这个称为分割（partition）操作。</li>
 * <li>递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。</li>
 * </ul>
 * 
 * @author popkidorc
 * 
 */
public class MyStrategySortQuick implements IMyStrategySort {

	@Override
	public void sort(int[] ints) throws Exception {
		// Arrays.sort(ints);//Arrays提供快速排序的方法
		quickSort(ints, 0, ints.length - 1);
	}

	public static void quickSort(int[] numbers, int start, int end) {
		if (start < end) {
			int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）
			int temp; // 记录临时中间值
			int i = start, j = end;
			do {
				while ((numbers[i] < base) && (i < end))
					i++;
				while ((numbers[j] > base) && (j > start))
					j--;
				if (i <= j) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
					i++;
					j--;
				}
			} while (i <= j);
			if (start < j)
				quickSort(numbers, start, j);
			if (end > i)
				quickSort(numbers, i, end);
		}
	}

}
