package com.ifeanyi.AmazonBooksApi.apiusers.service;

import com.ifeanyi.AmazonBooksApi.apiusers.entity.ApiUser;
import com.ifeanyi.AmazonBooksApi.exception.DuplicateException;
import reactor.core.publisher.Mono;

public interface ApiUserService {

    Mono<ApiUser> createApiUser(String email) throws DuplicateException;
    Mono<ApiUser> getByEmail(String email);

    Mono<ApiUser> getByApiKey(String apiKey);
    Mono<ApiUser> getById(Long id);
    void delete(String email);


}
