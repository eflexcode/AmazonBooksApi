package com.ifeanyi.AmazonBooksApi.apiusers.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Table(name = "apiusers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiUser {

    @Id
    @JsonIgnore
    private Long id;

    private String email;
    @Column(value = "api_key")
    private String apiKey;


}
