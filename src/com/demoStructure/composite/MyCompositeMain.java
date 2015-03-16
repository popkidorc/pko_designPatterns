package com.demoStructure.composite;

import com.demoStructure.composite.component.MyComponentAbstractOperation;
import com.demoStructure.composite.component.MyComponentCompositeOperation;
import com.demoStructure.composite.component.MyComponentLeafOperation;

/**
 * 组合模式_消费者类
 * 
 * @author popkidorc
 * 
 */
public class MyCompositeMain {

	private static MyComponentAbstractOperation rootOperation = new MyComponentCompositeOperation();

	// 一般composite不会单独使用，而是结合builder、factory等构造模式使用,用来构造对象。这里直接手工构造
	private static void init() {
		try {
			rootOperation.setOperationName("操作资源根节点");
			rootOperation.setOperationType("ROOT");
			rootOperation.setOperationContext("");

			MyComponentAbstractOperation loginOperation = new MyComponentLeafOperation();
			loginOperation.setOperationName("登录操作");
			loginOperation.setOperationType("OPERATION");
			loginOperation.setOperationContext("sys/base/login.action");
			rootOperation.add(loginOperation);

			MyComponentAbstractOperation menuOperation = new MyComponentCompositeOperation();
			menuOperation.setOperationName("菜单模块");
			menuOperation.setOperationType("MODULE");
			menuOperation.setOperationContext("");
			rootOperation.add(menuOperation);

			MyComponentAbstractOperation menuCreateOperation = new MyComponentLeafOperation();
			menuCreateOperation.setOperationName("菜单创建操作");
			menuCreateOperation.setOperationType("OPERATION");
			menuCreateOperation
					.setOperationContext("sys/menu/menuCreate.action");
			menuOperation.add(menuCreateOperation);

			MyComponentAbstractOperation menuMoveOperation = new MyComponentCompositeOperation();
			menuMoveOperation.setOperationName("菜单移动");
			menuMoveOperation.setOperationType("MODULE");
			menuMoveOperation.setOperationContext("");
			menuOperation.add(menuMoveOperation);

			MyComponentAbstractOperation menuMoveUpOperation = new MyComponentLeafOperation();
			menuMoveUpOperation.setOperationName("菜单上移操作");
			menuMoveUpOperation.setOperationType("OPERATION");
			menuMoveUpOperation
					.setOperationContext("sys/menu/menuMoveUp.action");
			menuMoveOperation.add(menuMoveUpOperation);
			MyComponentAbstractOperation menuMoveDownOperation = new MyComponentLeafOperation();
			menuMoveDownOperation.setOperationName("菜单下移操作");
			menuMoveDownOperation.setOperationType("OPERATION");
			menuMoveDownOperation
					.setOperationContext("sys/menu/menuMoveDown.action");
			menuMoveOperation.add(menuMoveDownOperation);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// 当发现需求中是体现部分与整体层次结构时，以及你希望用户可以忽略组合对象与单个对象的不同，统一地使用组合结构中的所有对象时，就应该考虑组合模式了。
		init();
		try {
			// 获取根节点下的所有子集
			rootOperation.getChildren();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
