package com.myapp.doctorapp.controller;

import com.myapp.doctorapp.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @GetMapping("/set_patient")
    public Response setDoctor(@RequestParam String patient) {

        System.out.println("patient" + patient);

        return new Response("success");
    }

}
