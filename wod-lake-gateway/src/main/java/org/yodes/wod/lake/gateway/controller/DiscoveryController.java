package org.yodes.wod.lake.gateway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/discovery")
	public List<String> greeting() {
		for(ServiceInstance serviceInstance : discoveryClient.getInstances("wod-lake-user-data")){
			System.out.println(serviceInstance.getHost());
			System.out.println(serviceInstance.getPort());
		}
		System.out.println(discoveryClient.getInstances("wod-lake-user-data"));
		return discoveryClient.getServices();
	}

}
