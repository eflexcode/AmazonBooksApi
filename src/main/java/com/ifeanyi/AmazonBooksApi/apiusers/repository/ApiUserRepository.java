package com.ifeanyi.AmazonBooksApi.apiusers.repository;

import com.ifeanyi.AmazonBooksApi.apiusers.entity.ApiUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ApiUserRepository extends ReactiveCrudRepository<ApiUser,Long> {

    Mono<ApiUser> findByEmail(final String email);
    Mono<ApiUser> findByApiKey(final String apiKey);

}
