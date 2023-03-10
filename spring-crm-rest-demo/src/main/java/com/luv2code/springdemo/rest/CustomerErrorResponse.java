package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.entity.Customer;

public class CustomerErrorResponse {

    private int status;
    private String message;
    private long timeStamp;

    // no args and normal constructor

    public CustomerErrorResponse(){}

    public CustomerErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    // generate getters and setters ....

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
