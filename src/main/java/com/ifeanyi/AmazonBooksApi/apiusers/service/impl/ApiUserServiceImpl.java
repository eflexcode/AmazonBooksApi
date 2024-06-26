package com.ifeanyi.AmazonBooksApi.apiusers.service.impl;

import com.ifeanyi.AmazonBooksApi.apiusers.entity.ApiUser;
import com.ifeanyi.AmazonBooksApi.apiusers.repository.ApiUserRepository;
import com.ifeanyi.AmazonBooksApi.apiusers.service.ApiUserService;
import com.ifeanyi.AmazonBooksApi.exception.DuplicateException;
import com.ifeanyi.AmazonBooksApi.util.Util;
import lombok.AllArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ApiUserServiceImpl implements ApiUserService {

    private ApiUserRepository apiUserRepository;

    @Override
    public Mono<ApiUser> createApiUser(String email) throws DuplicateException {

        if (!Util.isEmailValid(email))
            throw new DuplicateException("Email is not valid");

        ApiUser apiUser = new ApiUser();
        apiUser.setApiKey(UUID.randomUUID().toString());
        apiUser.setEmail(email);

        return apiUserRepository.save(apiUser);
    }

    @Override
    public Mono<ApiUser> getByEmail(String email) {
        return apiUserRepository.findByEmail(email);
    }

    @Override
    public Mono<ApiUser> getByApiKey(String apiKey) {
        return apiUserRepository.findByApiKey(apiKey);
    }

    @Override
    public Mono<ApiUser> getById(Long id) {
        return apiUserRepository.findById(id);
    }

    @Override
    public void delete(String email) {
        apiUserRepository.findByEmail(email).flatMap(apiUser-> apiUserRepository.delete(apiUser)).subscribe();
    }


}
