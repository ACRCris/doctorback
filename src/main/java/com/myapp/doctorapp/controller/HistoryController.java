package com.myapp.doctorapp.controller;


import com.myapp.doctorapp.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/history")
public class HistoryController {

    @GetMapping("/set_history")
    public Response setDoctor(@RequestParam String history) {

        System.out.println("history" + history);

        return new Response("success");
    }

}
