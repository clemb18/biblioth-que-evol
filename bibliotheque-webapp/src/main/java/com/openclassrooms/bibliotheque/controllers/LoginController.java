package com.openclassrooms.bibliotheque.controllers;

import com.openclassrooms.bibliotheque.models.Login;
import com.openclassrooms.bibliotheque.service.MemberService;
import com.openclassrooms.bibliotheque.ws.MemberWs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@RequestMapping("/")
@Controller
public class LoginController {

    @Autowired
    private MemberService memberService;

    @GetMapping("")
    public String welcome(Model model) {
        model.addAttribute("login", new Login());

        return "login";
    }

    @GetMapping("/login")
    public String deco(Model model) {
        model.addAttribute("login", new Login());

        return "login";
    }

    @PostMapping(path = "/login")
    public String login(Model model, HttpSession session, @ModelAttribute("login") Login login) {
        MemberWs memberWs = memberService.findMemberLogin(login.getMailAdress(), login.getPassword());
        if (memberWs != null) {
            model.addAttribute("message", "Bienvenue " + memberWs.getFirstName() + " "+ memberWs.getName());
            // envoie l'id du membre connecté en param session
            Long memberCoId = memberWs.getId();
            session.setAttribute("memberCoId", memberCoId);
        } else {
            model.addAttribute("message", "Wrong login and/or password.");
        }
       // return "redirect:/searchWork";
        return "home";
    }

    @GetMapping("/home")
    public String home() {

        return "home";
    }

}
