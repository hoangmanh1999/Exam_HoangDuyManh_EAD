package com.example.hoangduymanh.controller;

import com.example.hoangduymanh.entity.CandidateEntity;
import com.example.hoangduymanh.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CandidateController {
    @Autowired
    Service service;
    public String index(Model model){
        String mes = "Spring Boot + Thymeleaf";
        model.addAttribute("mes", mes);
        return "index";
    }
    @GetMapping("/add")
    public String add(Model model) {
        CandidateEntity candidate = new CandidateEntity();
        model.addAttribute("candidate", candidate);
        return "layout/add";
    }
    @GetMapping("/addS")
    public String addS(@Valid @ModelAttribute("candidate") CandidateEntity candidate,
                          BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "layout/add";
        }
        service.Add(candidate);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String GetAll(Model model){
        List<CandidateEntity> candidates =service.getAll();
        model.addAttribute("candidates" , candidates);
        return "layout/trangchu";
    }



}
