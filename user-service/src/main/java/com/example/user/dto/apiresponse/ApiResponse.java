package com.example.user.dto.apiresponse;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse<T> {

    private String status;
    private int code;
    private T data;
    private Object message;
    private LocalDateTime timestamp;

    public static <T> ApiResponse<T> success(int code,T data, Object message) {
        return ApiResponse.<T>builder()
                .status("SUCCESS")
                .code(code)
                .data(data)
                .message(message)
                .timestamp(LocalDateTime.now())
                .build();
    }

    public static <T> ApiResponse<T> success(int code, T data) {
        return ApiResponse.<T>builder()
                .status("SUCCESS")
                .code(code)
                .data(data)
                .timestamp(LocalDateTime.now())
                .build();
    }

    public static <T> ApiResponse<T> error(int code, T data, String message) {
        return ApiResponse.<T>builder()
                .status("ERROR")
                .code(code)
                .data(data)
                .message(message)
                .timestamp(LocalDateTime.now())
                .build();
    }

}