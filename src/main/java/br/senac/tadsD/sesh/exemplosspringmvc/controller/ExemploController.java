
package br.senac.tadsD.sesh.exemplosspringmvc.controller;

import br.senac.tadsD.sesh.exemplosspringmvc.Teste.Dados;
import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

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
     @GetMapping("/exemplo-request-param")
    public ModelAndView exemploRequestParam(
            @RequestParam(value="param1str",required = true, defaultValue ="valor") String param1,
            @RequestParam(value="param2int",required = false, defaultValue ="99") int param2 ){
        ModelAndView resposta = new ModelAndView("view-exemplo");
        return resposta;
    }
    
    @GetMapping("/exemplo-path-var/{param1str}/{param2int}")
    public ModelAndView exemploPathVariable (
            @PathVariable(value="param1str",required = true) String param1,
            @PathVariable(value="param2int",required = true) int param2) {
     ModelAndView resposta = new ModelAndView("view-exemplo");
        return resposta;
}
    @GetMapping("/exemplo-view-obj")
    public ModelAndView exemploViewObj(){
        ModelAndView mv = new ModelAndView("exemplo-view");
        mv.addObject("texto","Albion Online é um MMORPG sandbox");
        mv.addObject("numero",100);
        mv.addObject("dataHora",LocalDateTime.now());
        return mv;
    }
    
    @PostMapping("/post-form")
    public RedirectView saas (@ModelAttribute Dados dadosRecebidos,RedirectAttributes ra){
        ra.addFlashAttribute("dados",dadosRecebidos);
        if(dadosRecebidos.isValid()){
            return new RedirectView("form/sucess",true);
        }
        else
            return new RedirectView("form/fail",true);
        
       
    }
    
    @GetMapping("form/sucess")
    public ModelAndView soos (){
        ModelAndView mv = new ModelAndView("sucess");
         return mv;
    }
    
    @GetMapping("form/fail")
    public ModelAndView sees (){
        ModelAndView mv = new ModelAndView("fail");
         return mv;
    }
    
    
}
