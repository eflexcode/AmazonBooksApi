package com.ifeanyi.AmazonBooksApi.apiusers.controller;

import com.ifeanyi.AmazonBooksApi.apiusers.entity.ApiUser;
import com.ifeanyi.AmazonBooksApi.apiusers.service.ApiUserService;
import com.ifeanyi.AmazonBooksApi.exception.DuplicateException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/api_users")
public class ApiUserController {

    private ApiUserService apiUserService;

    @PostMapping
    public Mono<ApiUser> createApiUser(@RequestParam String email) throws DuplicateException {
        return apiUserService.createApiUser(email);
    }
    @PostMapping
    public Mono<ApiUser> getByEmail(@RequestParam String email) throws DuplicateException {
        return apiUserService.createApiUser(email);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestParam String email) throws DuplicateException {
         apiUserService.delete(email);
    }


}
