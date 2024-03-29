package com.spring.smbackend.security;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class JwtResponseDto {

    private String accessToken;
    private String refreshToken;
}
