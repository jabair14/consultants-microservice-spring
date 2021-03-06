package com.example.demo.consultant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "consultants")
public class ConsultantController {

    private final ConsultantService consultantService;

    @Autowired
    public ConsultantController(ConsultantService consultantService){
        this.consultantService = consultantService;
    }
    @GetMapping
    public List<Consultant> getConsultants(){
        return consultantService.getConsultants();
    }

}
