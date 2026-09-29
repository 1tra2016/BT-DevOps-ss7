package com.example.user.dto.apiresponse;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponse {
    private String accessToken;
    private String type;
    private String username;
}