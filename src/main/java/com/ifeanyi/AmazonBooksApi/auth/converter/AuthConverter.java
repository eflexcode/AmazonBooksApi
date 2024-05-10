package com.ifeanyi.AmazonBooksApi.auth.converter;

import com.ifeanyi.AmazonBooksApi.util.Util;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.server.authentication.ServerAuthenticationConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class AuthConverter implements ServerAuthenticationConverter {

    @Override
    public Mono<Authentication> convert(ServerWebExchange exchange) {

        System.out.println(exchange.getRequest().getHeaders().get(Util.APIKEY_NAME_HEADER)+"ooooooooooooooooooooooo");

        return null;
//        return Mono.just(exchange)
//                .flatMap(serverWebExchange -> Mono.just(serverWebExchange.getRequest().getHeaders().get(Util.APIKEY_NAME_HEADER)))
//                .filter(header -> !header.isEmpty())
//                .filterWhen(header -> {
//
//                    return null;
//                });
    }
}
