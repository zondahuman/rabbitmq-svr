package com.abin.lee.rabbitmq.svr.stub.model;

public class TaskInfoWithBLOBs extends TaskInfo {
    private String requestContext;

    private String responseContext;

    public String getRequestContext() {
        return requestContext;
    }

    public void setRequestContext(String requestContext) {
        this.requestContext = requestContext == null ? null : requestContext.trim();
    }

    public String getResponseContext() {
        return responseContext;
    }

    public void setResponseContext(String responseContext) {
        this.responseContext = responseContext == null ? null : responseContext.trim();
    }
}