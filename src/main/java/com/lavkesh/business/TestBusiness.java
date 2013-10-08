package com.lavkesh.business;

import java.util.List;

public interface TestBusiness {
	
	/**
	 * Get Lov
	 * @return
	 */
	public List<String> getLov();
	
	/**
	 * Clear cache
	 * @return
	 */
	public void clearCache();
	
}