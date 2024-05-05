package com.ifeanyi.AmazonBooksApi.apiusers.service;

import com.ifeanyi.AmazonBooksApi.apiusers.entity.ApiUser;
import reactor.core.publisher.Mono;

public interface ApiUserService {

    Mono<ApiUser> createApiUser(String email);
    Mono<ApiUser> getByEmail(String email);
    Mono<ApiUser> getById(Long id);


}
