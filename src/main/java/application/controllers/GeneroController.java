package application.controllers;

import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import application.models.Genero;
import application.repositories.GeneroRepository;

@Controller
@RequestMapping("/genero")
public class GeneroController {
    @Autowired
    private GeneroRepository generoRepo;
    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("generos", generoRepo.findAll());
        return "list.jsp"; 
        @RequestMapping(value = "/update", method = RequestMethod.POST)
        public String saveUpdate(@RequestParam("nome") String nome, @RequestParam("id") int id) {
            Optional<Genero> genero = generoRepo.findById(id);
            if(!genero.isPresent())
                return "redirect:/autor/list";
            genero.get().setNome(nome);
     
            generoRepo.save(genero.get());
     
            return "redirect:/genero/list";
            @RequestMapping("genero/delete/{id}")
            public String formDelete(Model model, @PathVariable int id) {
                Optional<Genero> genero = generoRepo.findById(id);
                if(!genero.isPresent())
                    return "redirect:/autor/list";
                model.addAttribute("genero", genero.get());
                return "/genero/delete.jsp";
                @RequestMapping(value = "/delete", method = RequestMethod.POST)
                public String confirmDelete(@RequestParam("id") int id) {
                    generoRepo.deleteById(id);
                    return "redirect:/genero/list";
                }
            }
        }
}
