/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.tadsD.sesh.exemplosspringmvc.controller;

import br.senac.tadsD.sesh.exemplosspringmvc.teste.Usuario;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author giovani.ajusto
 */
@Controller
public class UsuarioController {
    @GetMapping("/cadastro")
    public String exibirForms(Model model){
        model.addAttribute("usuario",new Usuario());
        return "formulario";
    }
    
    @PostMapping("/cadastrar-forms")
    public ModelAndView cadastrar(@ModelAttribute("usuario") @Valid Usuario user,
            BindingResult bindingResult,RedirectAttributes redirAttr){
        
       //Verifica se tem erros
       if(bindingResult.hasErrors())     {
           //tratativa de erro
           return new ModelAndView("formulario");
       }
       ModelAndView mv = new ModelAndView("redirect:/sucesso");
       
       //AddFlashAttribute adiciona um atributo flash
       //Um atributo flash dura apenas duas requisições, permitindo a utilização do
       //Post-Redirect-Get que redireciona a aplicação após realizar o Post.
       redirAttr.addFlashAttribute("usuario",user);
       return mv;
    } 
    
    
    
    @PostMapping("/cadastro")
    public String cadastrarForms(@Valid @ModelAttribute("usuario") Usuario usuario,
            BindingResult bindingResult){
       //Verifica se tem erros
       if(bindingResult.hasErrors())     {
           //tratativa de erro
           return ("formulario");
       }
       return "redirect:/sucesso";
       
    }
    
    @GetMapping("/sucesso")
    public String sucesso(){
        return "sucesso";
    }

}
