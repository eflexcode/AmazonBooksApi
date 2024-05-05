package com.ifeanyi.AmazonBooksApi.apiusers.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "api_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiUser {

    @Id
    private Long id;
    private String email;
    @Column(value = "api_key")
    private String apiKey;

}
