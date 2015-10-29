package org.yodes.wod.lake.eureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest
public class ApplicationTest {

	@Autowired
	private DiscoveryClient discoveryClient;

	/**
	 * Test the application loads and registers with eureka
	 */
	@Test
	public void contextLoads() {
		ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
		TestCase.assertNotNull(serviceInstance.getPort());
	}

}
