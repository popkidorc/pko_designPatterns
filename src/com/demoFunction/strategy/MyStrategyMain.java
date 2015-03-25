package com.demoFunction.strategy;

import java.util.Arrays;

import com.demoFunction.strategy.context.MyStrategyContext;
import com.demoFunction.strategy.convert.MyStrategySortBubble;
import com.demoFunction.strategy.convert.MyStrategySortInsertion;
import com.demoFunction.strategy.convert.MyStrategySortQuick;
import com.demoFunction.strategy.convert.MyStrategySortSelect;
import com.demoFunction.strategy.strategy.IMyStrategySort;


/**
 * 策略模式_消费者
 * 
 * @author popkidorc
 * 
 */
public class MyStrategyMain {

	public static void main(String[] args) {
		MyStrategyContext myStrategyContext = new MyStrategyContext();
		int[] ints = new int[10000];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = (int) (Math.random() * 100000);
		}
		System.out.println("ints==size==" + ints.length + "=="
				+ Arrays.toString(ints));
		// 快速排序
		int[] ints1 = ints.clone();
		try {
			IMyStrategySort myStrategySort = new MyStrategySortQuick();
			myStrategyContext.setMyStrategySort(myStrategySort);
			myStrategyContext.sort(ints1);
			System.out.println("==result==" + Arrays.toString(ints1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 插入排序
		int[] ints2 = ints.clone();
		try {
			IMyStrategySort myStrategySort = new MyStrategySortInsertion();
			myStrategyContext.setMyStrategySort(myStrategySort);
			myStrategyContext.sort(ints2);
			System.out.println("==result==" + Arrays.toString(ints2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 冒泡排序
		int[] ints3 = ints.clone();
		try {
			IMyStrategySort myStrategySort = new MyStrategySortBubble();
			myStrategyContext.setMyStrategySort(myStrategySort);
			myStrategyContext.sort(ints3);
			System.out.println("==result==" + Arrays.toString(ints3));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 选择排序
		int[] ints4 = ints.clone();
		try {
			IMyStrategySort myStrategySort = new MyStrategySortSelect();
			myStrategyContext.setMyStrategySort(myStrategySort);
			myStrategyContext.sort(ints4);
			System.out.println("==result==" + Arrays.toString(ints4));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
