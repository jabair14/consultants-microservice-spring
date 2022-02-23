package com.example.demo.consultant;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultantService {
    public List<Consultant> getConsultants() {
        return List.of(
                new Consultant(
                        1L,
                        "Tom",
                        "tbrady@gmail.com",
                        "Tampa Bay",
                        20

                )
        );
    }
}
