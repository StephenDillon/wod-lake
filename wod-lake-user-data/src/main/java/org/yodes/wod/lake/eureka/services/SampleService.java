package org.yodes.wod.lake.eureka.services;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

@Service
public class SampleService implements InitializingBean {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Printing services");
		System.out.println(discoveryClient);
		for(String service : discoveryClient.getServices()){
			System.out.println(service);
		}
	}

}
