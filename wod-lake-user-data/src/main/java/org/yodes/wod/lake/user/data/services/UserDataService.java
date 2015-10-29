package org.yodes.wod.lake.user.data.services;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yodes.wod.lake.user.data.model.User;
import org.yodes.wod.lake.user.data.repository.UserRestRepository;

@Service
public class UserDataService implements InitializingBean {

	@Autowired
	private UserRestRepository userRestRepository;

	@Override
	public void afterPropertiesSet() throws Exception {
		User user = new User();
		user.setName("MyUser");
		userRestRepository.save(user);
	}

}
