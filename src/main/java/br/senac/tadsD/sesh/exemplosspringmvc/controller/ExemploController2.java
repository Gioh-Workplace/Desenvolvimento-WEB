
package br.senac.tadsD.sesh.exemplosspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exemplo")
public class ExemploController2 {
    
     @GetMapping("/mensagem2")
    public ModelAndView saudar2(){
        return new ModelAndView("message-view");
    }

}
