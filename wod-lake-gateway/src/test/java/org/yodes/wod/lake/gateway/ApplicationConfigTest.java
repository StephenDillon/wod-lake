package org.yodes.wod.lake.gateway;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.shared.Applications;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationConfig.class)
@WebIntegrationTest
public class ApplicationConfigTest {

	@Autowired(required = true)
	private DiscoveryClient discoveryClient;

	@Test
	public void contextLoads() throws InterruptedException {
		TestCase.assertNotNull(discoveryClient);
//		Thread.sleep(10000);
		Applications local = discoveryClient.getApplications();
		System.out.println(local);
	}

}
