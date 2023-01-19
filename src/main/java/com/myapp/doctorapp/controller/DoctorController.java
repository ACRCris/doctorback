package com.myapp.doctorapp.controller;


import com.myapp.doctorapp.model.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @GetMapping("/set_doctor")
    public Response setDoctor(@RequestParam String doctor) {

        System.out.println("doctor" + doctor);

        return new Response("success");
    }




}

