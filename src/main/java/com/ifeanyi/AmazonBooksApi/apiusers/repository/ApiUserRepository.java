package com.ifeanyi.AmazonBooksApi.apiusers.repository;

import com.ifeanyi.AmazonBooksApi.apiusers.entity.ApiUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiUserRepository extends ReactiveCrudRepository<ApiUser,Long> {
}
