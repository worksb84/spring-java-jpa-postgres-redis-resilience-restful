package com.example.demo.response;

import com.example.demo.helper.ErrorCode;

import lombok.Getter;

@Getter
public class ErrorResponse {
    private int status;
    private String code;
    private String message;

    public ErrorResponse(final int status, final ErrorCode code) {
        this.status = status;
        this.message = code.getMessage();
        this.code = code.getCode();
    }
}
