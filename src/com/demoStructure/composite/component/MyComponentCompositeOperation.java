package com.demoStructure.composite.component;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式_操作资源类
 * 
 * @author popkidorc
 * 
 */
public class MyComponentCompositeOperation extends MyComponentAbstractOperation {

	// 定义一个List,用来保存组合体内的各个子对象.
	private List<MyComponentAbstractOperation> myComponentOperationChildren = new ArrayList<MyComponentAbstractOperation>();

	@Override
	public void add(MyComponentAbstractOperation myComponentOperation)
			throws Exception {
		myComponentOperationChildren.add(myComponentOperation);
	}

	@Override
	public void remove(MyComponentAbstractOperation myComponentOperation)
			throws Exception {
		myComponentOperationChildren.remove(myComponentOperation);
	}

	@Override
	public List<MyComponentAbstractOperation> getChildren() throws Exception {
		// 遍历该节点下的所有子对象，如果
		for (MyComponentAbstractOperation myComponentOperationChild : myComponentOperationChildren) {
			System.out.println("==parent : " + this.getOperationName()
					+ "==child : "
					+ myComponentOperationChild.getOperationName());
			try {
				myComponentOperationChild.getChildren();
			} catch (Exception e) {
				System.out.println(myComponentOperationChild.getOperationName()
						+ "==该节点为leaf节点，没有子对象");
				continue;
			}
		}
		return myComponentOperationChildren;
	}

	@Override
	public MyComponentAbstractOperation getChild(int index) throws Exception {
		return myComponentOperationChildren.get(index);
	}
}
