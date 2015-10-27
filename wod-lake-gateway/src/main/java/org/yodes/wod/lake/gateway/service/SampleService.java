package org.yodes.wod.lake.gateway.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.shared.Applications;

@Service
public class SampleService implements InitializingBean {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleService.class);

	@Autowired(required = true)
	private DiscoveryClient discoveryClient;

	@Override
	public void afterPropertiesSet() throws Exception {
		Applications services = discoveryClient.getApplications();
			LOGGER.info(services.toString());
	}

}
