package com.demoStructure.composite.component;

import java.util.List;

/**
 * 组合模式_实体类接口
 * 
 * @author popkidorc
 * 
 */
public interface IMyComponentOperation {

	public void add(MyComponentAbstractOperation myComponentOperation)
			throws Exception;

	public void remove(MyComponentAbstractOperation myComponentOperation)
			throws Exception;

	public List<MyComponentAbstractOperation> getChildren() throws Exception;

	public MyComponentAbstractOperation getChild(int index) throws Exception;
}
