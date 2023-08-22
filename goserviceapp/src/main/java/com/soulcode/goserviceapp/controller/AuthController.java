package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/auth")
public class AuthController {

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @GetMapping(value = "/cadastro")
    public ModelAndView cadastro(){
        ModelAndView mv = new ModelAndView("cadastroCliente");
        return mv;
    }

    @GetMapping("/password/new")
    public String alterarSenha(){
        return "alterarSenha";
    }

}
