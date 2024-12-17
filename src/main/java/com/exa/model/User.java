package com.exa.model;



import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("User")

public class User implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;
}
