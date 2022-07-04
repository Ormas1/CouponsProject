package com.or.couponsPhaseTwo.repositories;

import com.or.couponsPhaseTwo.entities.UsersEntity;
import org.springframework.data.repository.CrudRepository;


public interface IUsersRepository extends CrudRepository<UsersEntity, Long> {

}

