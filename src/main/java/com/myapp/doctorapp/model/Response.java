package com.myapp.doctorapp.model;

public class Response {
    private String status = "success";

    public Response(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


}
