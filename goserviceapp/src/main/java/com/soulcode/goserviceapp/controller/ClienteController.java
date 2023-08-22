package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
        @RequestMapping(value = "/cliente")
public class ClienteController {

    @GetMapping
    public String dados(){
        return "dadosCliente";
    }
}
