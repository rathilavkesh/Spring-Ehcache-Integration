package com.lavkesh.business.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.lavkesh.business.TestBusiness;
import com.lavkesh.dao.TestDao;

@Service("testBusiness")
public class TestBusinessImpl implements TestBusiness {
	
	public static Logger logger = LoggerFactory.getLogger(TestBusinessImpl.class);
	
	@Autowired
	private TestDao testDao;

	@Override
	public List<String> getLov() {
		return testDao.getLov();
	}

	@Override
	@CacheEvict(value="testCache", allEntries=true)
	public void clearCache() {
		logger.debug("clear cache.");
	}

}