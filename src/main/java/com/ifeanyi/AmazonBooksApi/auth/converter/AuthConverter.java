package com.ifeanyi.AmazonBooksApi.auth.converter;

import com.ifeanyi.AmazonBooksApi.apiusers.entity.ApiUser;
import com.ifeanyi.AmazonBooksApi.apiusers.service.ApiUserService;
import com.ifeanyi.AmazonBooksApi.exception.DuplicateException;
import com.ifeanyi.AmazonBooksApi.util.Util;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.server.authentication.ServerAuthenticationConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class AuthConverter implements ServerAuthenticationConverter {

    private ApiUserService apiUserService;

    @Override
    public Mono<Authentication> convert(ServerWebExchange exchange) {

        System.out.println(exchange.getRequest().getHeaders().get(Util.APIKEY_NAME_HEADER) + "ooooooooooooooooooooooo");

        return Mono.justOrEmpty(exchange)
                .flatMap(serverWebExchange -> Mono.justOrEmpty(serverWebExchange.getRequest().getHeaders().get(Util.APIKEY_NAME_HEADER)))

                .filter(headerList -> !headerList.isEmpty())
                .flatMap(headerList -> isApiKeyValid(headerList.get(0)));

    }

    private Mono<ApiUser> isApiKeyValid(final String apikey) {

        return apiUserService.getByApiKey(apikey).switchIfEmpty(Mono.error(new DuplicateException("Api key is invalid"))).flatMap(apiUser -> {
            apiUser.setAuthenticated(true);
            return Mono.justOrEmpty(apiUser);
        });

    }

}
