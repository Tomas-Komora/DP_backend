package com.example.SpringBootDP;

public class MyResponse {
    private String message;
    private int code;

    // Standard getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}