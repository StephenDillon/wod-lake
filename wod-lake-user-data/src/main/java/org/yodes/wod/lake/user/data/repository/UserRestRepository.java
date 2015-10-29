package org.yodes.wod.lake.user.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.yodes.wod.lake.user.data.model.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRestRepository extends PagingAndSortingRepository<User, String> {

}
