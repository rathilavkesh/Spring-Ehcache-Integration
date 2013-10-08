package com.lavkesh.business;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.AbstractTransactionManagementConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml"})
public class JunitTest extends AbstractTransactionManagementConfiguration {
	
	public static Logger logger = LoggerFactory.getLogger(JunitTest.class);
	
	@Autowired
	private TestBusiness testBusiness;
	
	@Test
	public void testGetLov(){
		logger.debug("Get lov first");
		List<String> lov = testBusiness.getLov();
		logger.debug(""+lov);
		
		logger.debug("Get lov second");
		lov = testBusiness.getLov();
		
		logger.debug("Clear cache");
		testBusiness.clearCache();
		
		logger.debug("Get lov third");
		testBusiness.getLov();
	}

}