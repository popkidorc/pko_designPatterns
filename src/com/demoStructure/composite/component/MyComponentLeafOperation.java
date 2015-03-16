package com.demoStructure.composite.component;

import java.util.List;

/**
 * 组合模式_操作资源叶子类
 * 
 * @author popkidorc
 * 
 */
public class MyComponentLeafOperation extends MyComponentAbstractOperation {
	// 叶子节点没有子集，所以4个方法均不适用
	@Override
	public void add(MyComponentAbstractOperation myComponentOperation)
			throws Exception {
		throw new Exception("末级操作资源不能add");
	}

	@Override
	public void remove(MyComponentAbstractOperation myComponentOperation)
			throws Exception {
		throw new Exception("末级操作资源不能remove");
	}

	@Override
	public List<MyComponentAbstractOperation> getChildren() throws Exception {
		throw new Exception("末级操作资源没有children");
	}

	@Override
	public MyComponentAbstractOperation getChild(int index) throws Exception {
		throw new Exception("末级操作资源没有children");
	}
}
