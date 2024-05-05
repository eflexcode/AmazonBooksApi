package com.ifeanyi.AmazonBooksApi.apiusers.service.impl;

import com.ifeanyi.AmazonBooksApi.apiusers.entity.ApiUser;
import com.ifeanyi.AmazonBooksApi.apiusers.service.ApiUserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ApiUserServiceImpl implements ApiUserService {


    @Override
    public Mono<ApiUser> createApiUser(String email) {
        return null;
    }

    @Override
    public Mono<ApiUser> getByEmail(String email) {
        return null;
    }

    @Override
    public Mono<ApiUser> getById(Long id) {
        return null;
    }


}
