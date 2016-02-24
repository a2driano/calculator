package com.calculator.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * @version 1.0
 * @autor a2driano
 * @project: calculator
 * @since 23.02.2016
 */
@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CalcDTO implements Serializable {

    private Double firstdigit;
    private Double secondigit;
    private Double result;
    private String message;
    private String operation;

    public Double getFirstdigit() {
        return firstdigit;
    }

    public void setFirstdigit(Double firstdigit) {
        this.firstdigit = firstdigit;
    }

    public Double getSecondigit() {
        return secondigit;
    }

    public void setSecondigit(Double secondigit) {
        this.secondigit = secondigit;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
