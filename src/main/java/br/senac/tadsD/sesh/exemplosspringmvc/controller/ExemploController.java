
package br.senac.tadsD.sesh.exemplosspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exemplo")
public class ExemploController {
    
    @GetMapping("/mensagem")
    public String saudar1(Model model){
        return "message-view";
    }
    @GetMapping("/mensagem2")
    public ModelAndView saudar2(){
        return new ModelAndView("message-view");
    }
     @GetMapping("/mensagem3")
    public ModelAndView saudar3(){
        return new ModelAndView("message-view");
    }
}
