package org.yodes.wod.lake.eureka.services;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.yodes.wod.lake.eureka.api.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRestRepository extends MongoRepository<User, String> {

}