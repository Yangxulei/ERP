package com.iss.common;

import java.util.List;

public interface TreeNode {
	
	public Object getId();
	public String getText();
	public String getDesc();
	public List<TreeNode> getChildren();
	
}
