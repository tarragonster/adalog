package com.adalog.exception.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Exception {

    @JsonProperty("ErrCod")
    private String code;

    @JsonProperty("ErrVal")
    private String message;

    @JsonIgnore
    private Object[] arguments;

    public Exception(String code, String message) {
        this(code, message, null);
    }

    public Exception(String code, String message, Object[] arguments) {
        super();
        this.code = code;
        this.message = message;
        this.arguments = arguments;
    }

    public Exception() {
        // default constructor for Json
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object[] getArguments() {
        return arguments;
    }

    public void setArguments(Object[] arguments) {
        this.arguments = arguments;
    }
}